package Classes;

import java.util.ArrayList;

public class Lecture {
    private String LName;
    private String LNumber;

    FileManger FManger = new FileManger();
    private final String LectureFileName = "Lectures.txt";

    Course course;

    public static ArrayList<Lecture> Lectures = new ArrayList<Lecture>();

    public Lecture(){
    }

    public Lecture(String LName , String LNumber , Course course){
        this.LName =LName;
        this.LNumber = LNumber;
        this.course = course ;
    }

    public void setLName(String LName){
        this.LName = LName ;
    }

    public String getLName() {
        return LName;
    }

    public void setLNumber(String LNumber) {
        this.LNumber = LNumber;
    }

    public String getLNumber() {
        return LNumber;
    }

    public boolean addLecture(){
        if (FManger.write(getLectureData(),LectureFileName,true)){
            return true;
        }
        else {
            return false;
        }
    }

    private String getLectureData(){
        return this.LName + "@" + this.LNumber +"@";
    }

    private void commitToFile(){
        FManger.write(Lectures.get(0).getLectureData(),LectureFileName,false);
        for (int i = 1;i<Lectures.size();i++){
            FManger.write(Lectures.get(i).getLectureData(),LectureFileName,true);
        }
    }

    private int getLectureIndex(String LNumber){
        for(int i = 0;i< Lectures.size();i++)
            if(Lectures.get(i).getLNumber().equals(LNumber))
                return i;
        return -1;
    }

    private void loadFromFile(){
        Lectures = (ArrayList<Lecture>) (Object) FManger.read(LectureFileName);
    }

    public String displayAllLectures(){
        loadFromFile();
        String S = "\nAll Lectures Data :\n";
        for (Lecture x : Lectures){
            S = S + x.toString();
        }
        return S;
    }

    public String searchLecture(String number){
        loadFromFile();
        int index = getLectureIndex(number);
        if(index != -1)
            return "\nFound " + Lectures.get(index).toString();
        else
            return "\nNot Found ";
    }

    public void updateLecture(String oldNumber,Lecture x){
        loadFromFile();
        int index = getLectureIndex(oldNumber);
        Lectures.set(index,x);
        commitToFile();
    }

    public void deleteLecture(String number){
        loadFromFile();
        int index = getLectureIndex(number);
        Lectures.remove(index);
        commitToFile();
    }

    @Override
    public String toString(){
        return "\nLecture Name : " + LName + "\tLecture Number : " + LNumber + "\n" ;
    }

}
