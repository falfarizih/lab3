public class Main {
    public static void main(String[] args) {
        Enrolment enrolment = new Enrolment();

        Course course1= new Course("Info-1", 4000);
        Course course2= new Course("GDM", 3000);
        Course course3= new Course("GWP", 100);


        course1.addCourseToTheList(enrolment);
        course2.addCourseToTheList(enrolment);
        course3.addCourseToTheList(enrolment);

        enrolment.printAllCourses();

        enrolment.getCapacityOfACourse(2);
        enrolment.getNameOfACourse(2);

        System.out.println(enrolment.getNameOfACourse(2));
    }


}