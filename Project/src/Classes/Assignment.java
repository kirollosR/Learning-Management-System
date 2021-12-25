package Classes;

import java.util.ArrayList;
import java.util.Date;

public class Assignment {
    private String AName;
    private String AType;
    private Date ADueDate;

    FileManger FManger = new FileManger();
    private final String AssignmentFileName = "Assignment.txt";

    Course course ;

    public static ArrayList<Assignment> Assignments = new ArrayList<Assignment>();

    public Assignment(){
    }

    public Assignment(String AName,String AType,Date ADueDate,Course course){
        this.AName = AName;
        this.AType = AType;
        this.ADueDate = ADueDate ;
        this.course = course;
    }

    public void setAName(String AName){
        this.AName = AName;
    }

    public String getAName() {
        return this.AName;
    }

    public void setAType(String AType){
        this.AType = AType ;
    }

    public String getAType(){
        return this.AType;
    }

    public void setADueDate(Date ADueDate){
        this.ADueDate = ADueDate ;
    }

    public Date getADueDate(){
        return this.ADueDate;
    }

    public boolean addAssignment(){
        if (FManger.write(getAssignmentData(), AssignmentFileName,true)) {
            return true;
        }
        else {
            return false;
        }
    }

    private String getAssignmentData(){
        return this.AName + "@" + this.AType + "@" + this.ADueDate +"@" ;
    }

    private void commitToFile(){
        FManger.write(Assignments.get(0).getAssignmentData(),AssignmentFileName,false);
        for (int i = 1; i<Assignments.size();i++){
            FManger.write(Assignments.get(i).getAssignmentData(), AssignmentFileName,true);
        }
    }

    private int getAssignmentIndex(String name){
        for(int i=0; i<Assignments.size();i++)
            if(Assignments.get(i).getAName().equals(AName))
                return i;
        return -1;
    }

    private void loadFromFile(){
        Assignments = (ArrayList<Assignment>) (Object) FManger.read(AssignmentFileName);
    }

    public String displayAllAssignments(){
        loadFromFile();
        String S = "\nAll Courses Data:\n";
        for(Assignment x : Assignments){
            S = S + x.toString();
        }
        return S ;
    }

    public String searchAssignment(String name){
        loadFromFile();
        int index = getAssignmentIndex(name);
        if(index != -1)
            return "\nFound " + Assignments.get(index).toString();
        else
            return "\nNot Found ";
    }

    public void updateAssignment(String oldName,Assignment x){
        loadFromFile();
        int index = getAssignmentIndex(oldName);
        Assignments.set(index,x);
        commitToFile();
    }

    public void deleteAssignment(String name){
        loadFromFile();
        int index = getAssignmentIndex(name);
        Assignments.remove(index);
        commitToFile();
    }

    @Override
    public String toString(){
        return "\nAssignment Name : " + AName + "\tAssignment Type : " + AType + "\nAssignment Due Date : " + ADueDate ;
    }
}





