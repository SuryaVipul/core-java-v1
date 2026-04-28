package oops.encapsulation;

class Course{
    private int courseId;
    private String courseName;
    private String instructorName;
    private int maxSeats;
    private int enrolledStudents;

    public Course(int courseId, String courseName, String instructorName, int maxSeats) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructorName = instructorName;
        this.maxSeats = maxSeats;
        enrolledStudents = 0;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public int getMaxSeats() {
        return maxSeats;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    public void enrollStudent(){
        if (enrolledStudents < maxSeats)
            enrolledStudents= enrolledStudents + 1;
        else
            System.out.println("No seats available");
    }

    public void dropStudent() {
        if (enrolledStudents > 0)
            enrolledStudents = enrolledStudents - 1;
        else
            System.out.println("No students to remove");
    }

    public void updateInstructor(String newInstructor){
        this.instructorName = newInstructor;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name :- "+this.getCourseName());
        System.out.println("Instructor :- "+this.getInstructorName());
        System.out.println("Max Seats :- "+this.getMaxSeats());
        System.out.println("Enrolled :- "+this.getEnrolledStudents());
        System.out.println("Available Seats :- "+(this.getMaxSeats() - this.getEnrolledStudents()));
    }
}

public class LaunchEnacp5 {

    public static void main(String[] args) {
        Course course1 = new Course(101, "Java", "Surya", 3);
        course1.displayCourseDetails();
        course1.enrollStudent();
        course1.enrollStudent();
        course1.enrollStudent();
        course1.enrollStudent();

        course1.displayCourseDetails();

        course1.dropStudent();
        course1.dropStudent();
        course1.dropStudent();
        course1.dropStudent();
        course1.updateInstructor("Vipul");
        course1.displayCourseDetails();
    }
}
