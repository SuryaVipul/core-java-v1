package oops.encapsulation;

class Employee {
    private int id;
    private String name;
    private String location;

    public Employee(int id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
public class LaunchEncap2 {

    public static void main(String[] args) {
        Employee employee1 = new Employee(101,"Surya","Mumbai");
        Employee employee2 = new Employee(102,"Jaya","Delhi");

        System.out.println("Employee 1 Details");
        employee1.setName("Surya Shukla");
        employee1.setLocation("Pune");
        System.out.println("Id :- "+employee1.getId());
        System.out.println("Name :- "+employee1.getName());
        System.out.println("Location :- "+employee1.getLocation());

        System.out.println("Employee 2 Details");
        employee2.setName("Jaya Mishra");
        employee2.setLocation("Delhi");
        System.out.println("Id :- "+employee2.getId());
        System.out.println("Name :- "+employee2.getName());
        System.out.println("Location :- "+employee2.getLocation());
    }
}
