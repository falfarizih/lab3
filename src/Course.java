import java.util.ArrayList;

public class Course {
    private String courseName;
    private int capacity;
    private int attendence;

    ArrayList<Student> registeredStudents = new ArrayList<>();

    public Course(String courseName, int capacity, int attendence){
        this.courseName= courseName;
        this.capacity = capacity;
        this.attendence = attendence;
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

}
