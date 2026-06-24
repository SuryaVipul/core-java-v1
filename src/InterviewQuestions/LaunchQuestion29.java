package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// Interview Question ->  Parallel Streams in Java 8

class Employee5 {
    String name;
    String department;
    int salary;
    public Employee5(String name, String department, int salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    public String getName() {
        return name;
    }
    public String getDepartment() {
        return department;
    }
    public int getSalary() {
        return salary;
    }
    @Override
    public String toString() {
        return "Employee5{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class LaunchQuestion29 {
    public static void main(String[] args) {
        List<Employee5> employees = new ArrayList<>(Arrays.asList(
                new Employee5("Amit", "IT", 70000),
                new Employee5("Sneha", "IT", 80000),
                new Employee5("Vikram", "HR", 75000),
                new Employee5("Pooja", "HR", 60000),
                new Employee5("Arjun", "Finance", 95000),
                new Employee5("Kavya", "Finance", 65000),
                new Employee5("Rohit", "IT", 72000),
                new Employee5("Anjali", "Marketing", 58000)
        ));

        employees.parallelStream()
                .map(emp -> emp.getName())
                .forEachOrdered(name -> System.out.println(name));

        System.out.println();

        long start = System.currentTimeMillis();

        employees.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.toList());

        long end = System.currentTimeMillis();

        System.out.println("Time difference " + (end-start));

    }
}
