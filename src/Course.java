import java.util.ArrayList;

public class Course {
    private String courseName;
    private int capacity;
    private int amountOfStudents;

    ArrayList<Student> registeredStudents = new ArrayList<>();

    public Course(String courseName, int capacity){
        this.courseName= courseName;
        this.capacity = capacity;
        amountOfStudents = 0;
    }


    public String getCourseName(){
        return courseName;
    }

    public int getCapacity(){
        return capacity;
    }

    public int getAmountOfStudents(){
        return amountOfStudents;
    }

    public void printAmountOfStudents(){
        System.out.println(amountOfStudents);
    }

    public void registerStudent(Student student){
            registeredStudents.add(student);
            amountOfStudents += 1;
    }

    public void addCourseToTheList(Administration administration){
        administration.addCourse(Course.this);
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
