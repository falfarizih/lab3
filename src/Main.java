public class Main {
    public static void main(String[] args) {
        Administration administration = new Administration();

        Student student1 = new Student(001, "Kartik");
        Student student2 = new Student(002, "Kartik1");
        Student student3 = new Student(003, "Kartik2");
        Student student4 = new Student(004, "Kartik3");
        Student student5 = new Student(005, "Kartik4");



        Course course1= new Course("Info-1", 2);
        Course course2= new Course("GDM", 3);
        Course course3= new Course("GWP", 3);

        student1.registerCourse(course1);
        student2.registerCourse(course1);
        student3.registerCourse(course1);

        course1.addCourseToTheList(administration);
        course2.addCourseToTheList(administration);
        course3.addCourseToTheList(administration);


        administration.printAllCourses();
        administration.checkAmountOfStudentInACourse(0);

        administration.getCapacityOfACourse(2);
        administration.getNameOfACourse(2);

        System.out.println(administration.getNameOfACourse(2));
    }


}