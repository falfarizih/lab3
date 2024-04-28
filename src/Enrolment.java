import java.util.ArrayList;

public class Enrolment {
   private int totalStudents;

   ArrayList<Course> listOfCourses = new ArrayList<>();

   public Enrolment() {
   }

   public void addCourse(Course course) {
       listOfCourses.add(course);
   }

    public int getCapacityOfACourse(int index){
        return listOfCourses.get(index).getCapacity();
    }

    public String getNameOfACourse(int index){
        return listOfCourses.get(index).getCourseName();
    }

    public void registerCourse(Course course){
        listOfCourses.add(course);
    }
    public void printAllCourses(){
       for (Course course : listOfCourses) {
           System.out.println(course.getCourseName());
       }
    }


}

