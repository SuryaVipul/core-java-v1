package oops.objectAndclasses;

class Student1 {
    int id;
    String name;
    int  age;


    Student1(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void displayStudentDetails (){
        System.out.println("Students  details ");
        System.out.println("Id :- " +this.id);
        System.out.println("Name :- " + this.name );
        System.out.println("Age :- " + this.age);
    }
}

public class LaunchOOP3 {
    public static void main(String[] args) {
        Student1 stu = new Student1(101, "Surya", 29);
        stu.displayStudentDetails();
        Student1 stu1 = new Student1(102,"Vipul",26);
        stu1.displayStudentDetails();
        Student1 stu2 = new Student1(103,"Sujit", 25);
        stu2.displayStudentDetails();

    }
}
