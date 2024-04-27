import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getName() {
        Student student1 = new Student(001, "Kartik");
        assertEquals("Kartik", student1.getName());
    }

    @Test
    void getMatrikelNummer() {
        Student student1 = new Student(001, "Kartik");
        assertEquals(001, student1.getMatrikelNummer());
    }

    @Test
    void registerCourseandCheckifRegistered() {
        Course course1 = new Course("Info1", 3);
        Student student1 = new Student(001, "Kartik");
        student1.registerCourse(course1);
        course1.printRegisteredStudents();
        assertEquals("Kartik", course1.getRegisteredStudent(0).getName());
    }

    @Test
    void printRegisteredStudents() {
        Course course1 = new Course("Info1", 3);
        Student student1 = new Student(001, "Kartik");
        student1.registerCourse(course1);
        course1.printRegisteredStudents();
        assertEquals("Kartik", course1.getRegisteredStudent(0).getName());
    }
}