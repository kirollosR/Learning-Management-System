package Classes;

import java.util.ArrayList;

public class RegisteredCourses extends Course{

    private int studentID;
    private Course c;
    private String courseID;

    Student x = new Student();
    private final String RegisteredCoursesFileName = "RegisteredCourses.txt" ;

    public static ArrayList<Course> RegisteredCourses = new ArrayList<Course>();

    public RegisteredCourses(){

    }
    public RegisteredCourses(String courseID){
        super(courseID);
        c = searchCourse(courseID);
    }
    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setCId(String CId){
        this.courseID = CId ;
    }

    public boolean addRegisteredCourse(){
        if (FManger.write(getRegisteredCourseData(), RegisteredCoursesFileName, true)){
            return true ;
        }
        else {
            return false ;
        }
    }

    private void loadFromFile(){
        RegisteredCourses = (ArrayList<Course>) (Object) FManger.read(RegisteredCoursesFileName);
    }

    public ArrayList<Course> listCourses() {
        loadFromFile();
        return RegisteredCourses;
    }

    private String getRegisteredCourseData(){

        return this.studentID + "#" + c.getCName() + "#" + c.getCId() + "#" + c.getCreditHours() + "#" + c.dept.getDeptName();
    }
}
