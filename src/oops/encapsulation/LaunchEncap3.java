package oops.encapsulation;

class Employee1 {
    private int id;
    private String name;
    private double salary;
    private String department;

    public Employee1(int id, String name, double salary, String department) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void updateDepartment(String department) {
        this.department = department;
    }
    public void increaseSalary(double amount) {
        this.salary = this.salary + amount;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee details");
        System.out.println(this.getId());
        System.out.println(this.getName());
        System.out.println(this.getSalary());
        System.out.println(this.getDepartment());
    }
}
public class LaunchEncap3 {

    public static void main(String[] args) {
        Employee1 employee1 = new Employee1(501,"Surya",50000,"Support");
        Employee1 employee2 = new Employee1(502,"Vipul",30000,"Backoffice chat Support");

        employee1.updateDepartment("IT");
        employee1.increaseSalary(50000);
        employee1.displayEmployeeDetails();


        employee2.updateDepartment("CA");
        employee2.increaseSalary(30000);
        employee2.displayEmployeeDetails();


    }

}
