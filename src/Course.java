import java.util.ArrayList;

public class Course {
    private String courseName;
    private int capacity;
    private int attendence;

    ArrayList<Student> registeredStudents = new ArrayList<>();

    public Course(String courseName, int capacity){
        this.courseName= courseName;
        this.capacity = capacity;
    }


    public String getCourseName(){
        return courseName;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getAttendence(){
        return attendence;
    }

    public void registerStudent(Student student){
        registeredStudents.add(student);
    }

    public void addCourseToTheList(Enrolment enrolment){
        enrolment.addCourse(Course.this);
    }

    public Student getRegisteredStudent(int index){
        return registeredStudents.get(index);
    }

    public ArrayList<Student> getRegisteredStudentArray(){
        return registeredStudents;
    }


    public void printRegisteredStudents(){
        for(Student student : registeredStudents){
            System.out.println(student);
        }
    }
}
