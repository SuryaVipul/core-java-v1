package InterviewQuestions;

// Interview Question ->  Final variable working at field level, method level and a class level.

//final class Employee1
class Employee1 {
    Long id;
    String name;
   // final String company = "Google";
   String company;

    public Employee1(String company) {
       // this.company = "Google";
        this.company = company;
    }
    public Employee1() {
    }

    public void printEmployeeInfo() {
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Company: "+company);
    }

    public void greet() {
        System.out.println("Hello, I am an employee");
    }
}

class Intern extends Employee1 {
    @Override
    public void greet() {
        System.out.println("Hello, I am an intern");
    }
}

class Manager extends Employee1 {
    @Override
    public void greet() {
        System.out.println("Hello, I am an Manager");
    }
}


public class LaunchQuestion10 {

    public static void main(String[] args) {
        Employee1 e1 = new Employee1("Amazon");
        e1.id = 1l;
        e1.name = "Surya";

        e1.printEmployeeInfo();

        Employee1 e2 = new Employee1("Delloite");
        e2.id = 2l;
        e2.name = "Vipul";

        e2.printEmployeeInfo();

        Employee1 e3 = new Employee1();
        e3.greet();

        Intern intern = new Intern();
        intern.greet();

        Manager manager = new Manager();
        manager.greet();

        // finalize() method in java
        String s = new String("Hello");
        s = null;

        System.gc();


    }
//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Garbage Collection taking place");
//    }
}
