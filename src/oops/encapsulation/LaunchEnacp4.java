package oops.encapsulation;


class Student {
    private int rollNumber;
    private String name;
    private String course;
    private int marks;

    public Student(int rollNumber, String name, String course, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public int getMarks() {
        return marks;
    }

    public void updateMarks(int marks) {
        this.marks = marks;
    }

    public void displayStudentDetails() {
        System.out.println("Student Details ");

        System.out.println(this.getName());
        System.out.println(this.getRollNumber());
        System.out.println(this.getMarks());
        System.out.println(this.getCourse());
    }
}

public class LaunchEnacp4 {

    public static void main(String[] args) {
        Student student1 = new Student(1001, "Surya", "Core Java", 98);
        Student student2 = new Student(1002, "Vipul", "DSA", 87);

        student1.displayStudentDetails();
        student1.updateMarks(90);
        student1.setCourse("OOPS");
        student1.displayStudentDetails();

        student2.displayStudentDetails();
        student2.updateMarks(80);
        student2.setCourse("Arrays");
        student2.displayStudentDetails();
    }
}
