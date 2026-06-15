package InterviewQuestions;

// Interview Question -> Comparator vs Comparable | compare() vs compareTo()

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// class Employee2 implements Comparable
 class Employee2 {
    private int id;
    private String name;
    private int age;

    public Employee2(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    @Override
//    public int compareTo(Object o) {
//        Employee2 e = (Employee2) o;
//        if (this.getId() == e.getId()) {
//            return 0;
//        } else if (this.getId() > e.getId()) {
//            return 1;
//        } else {
//            return -1;
//        }
//    }
//}

}

public class LaunchQuestion15 {
    public static void main(String[] args) {
        Employee2 e1 = new Employee2(1,"Surya",25);
        Employee2 e2 = new Employee2(3,"Jaya",21);
        Employee2 e3 = new Employee2(4,"Harshit",28);
        Employee2 e4 = new Employee2(2,"Sumit",31);
        Employee2 e5 = new Employee2(5,"Manas",18);


        List<Employee2> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        // using comparable here
       // Collections.sort(employees);


        // using comparator here
        Collections.sort(employees,(a,b) -> {
            if (a.getId() == b.getId()){
                return 0;
            }
            else if (a.getId() > b.getId()) {
                return 1;
            }
            else {
                return -1;
            }
        });

        print(employees);

        System.out.println("*********************");

        Collections.sort(employees,(a,b) -> {
            if (a.getAge() == b.getAge()){
                return 0;
            }
            else if (a.getAge() > b.getAge()) {
                return 1;
            }
            else {
                return -1;
            }
        });

        print(employees);
    }

    public static void print(List<Employee2> employeeList) {
        for (Employee2 employee : employeeList) {
            System.out.println("ID: "+employee.getId() + "  Name: "+employee.getName() + "  Age: "+employee.getAge());
        }
    }
}
