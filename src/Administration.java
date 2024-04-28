import java.util.ArrayList;

public class Administration {

   ArrayList<Course> listOfCourses = new ArrayList<>();

   public Administration() {
   }

   public void addCourse(Course course) {
       listOfCourses.add(course);
   }

    public int getCapacityOfACourse(int index){
        return listOfCourses.get(index).getCapacity();
    }

    public int getAmountOfStudentInACourse(int index){
        return listOfCourses.get(index).getAmountOfStudents();
    }

    public String getNameOfACourse(int index){
        return listOfCourses.get(index).getCourseName();
    }


    public void printAllCourses(){
       for (Course course : listOfCourses) {
           System.out.println(course.getCourseName());
       }
    }

    public void checkAmountOfStudentInACourse(int index){
       if(getAmountOfStudentInACourse(index) <= getCapacityOfACourse(index)){
           System.out.println("The amount of student is still within the capacity");
       } else {
           System.out.println("The amount of student exceeds the capacity, a new lab will be opened");
       }
    }

}

