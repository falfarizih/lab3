public class Student {
    private int matrikelNummer;
    private String name;

    public Student(int matrikelNummer, String name) {

        this.matrikelNummer = matrikelNummer;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getMatrikelNummer() {
        return matrikelNummer;
    }

    public void registerCourse(Course course) {
        course.registerStudent(Student.this);
    }
}