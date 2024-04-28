public class Grade{
    private int marks;
    private int studentNumber;
    private String courseName;

    public Grade(int marks, int studentNumber, String courseName) {
        this.marks = marks;
        this.studentNumber = studentNumber;
        this.courseName = courseName;
    }

    public int getMarks() {
        return marks;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getCourseName() {
        return courseName;
    }

    public void printMarks(){
        System.out.println("The marks of the student with student number "+studentNumber+" for "+courseName+" is: " + marks);
    }
}
