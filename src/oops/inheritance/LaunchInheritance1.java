package oops.inheritance;

class Employee{
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayEmployeeDetails(){
        System.out.println(this.getId());
        System.out.println(this.getName());
    }
}

class Developer extends Employee{
    private String programmingLanguage;

    public Developer(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }
    public void displayDeveloperDetails(){
        System.out.println(this.getProgrammingLanguage());
    }
}

public class LaunchInheritance1 {
    public static void main(String[] args) {
        Developer developer1 = new Developer("Java");
        developer1.setId(101);
        developer1.setName("Surya");
        developer1.displayDeveloperDetails();
        developer1.displayEmployeeDetails();

    }
}
