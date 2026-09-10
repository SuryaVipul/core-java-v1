package collections.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() { return id; }
    public String getName() { return name; }

}

public class Practice3 {

    public static void main(String[] args) {
        List<Employee> databaseResults = new ArrayList<>();
        databaseResults.add(new Employee(101, "Alice"));
        databaseResults.add(new Employee(102, "Bob"));
        databaseResults.add(new Employee(103, "Charlie"));

        Map<Integer, Employee> map = new HashMap<>();

        for(Employee employee : databaseResults) {
            map.put(employee.getId(), employee);
        }
        System.out.println(map.get(102).getName());
    }

}
