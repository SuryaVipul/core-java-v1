package InterviewQuestions;

// Interview Question -> The Top Java Lambda Expression Interview Questions


import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Emp {
    int id;
    String name;
    int age;
    double salary;
    String department;

    public Emp(int id, String name, int age, double salary, String department) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
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

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}

@FunctionalInterface
interface OperationInterface {
    public abstract int Operation(int a, int b);
}

public class LaunchQuestion33 {

    public static int performOperation(int x, int y, OperationInterface operationInterface) {
        return operationInterface.Operation(x,y);
    }

    public static void main(String[] args) {
        // 1 -> Question: Given a list of Employee objects (containing fields: id, name, age, salary, department),
        // write a Lambda-based Stream pipeline to extract
        // a List containing only the names of employees who are older than 30 and earn a salary greater than $75,000.

        List<Emp> emps = Arrays.asList(
                new Emp(1,"Amit",23,20000,"Tech"),
                new Emp(2,"Neha",31,52000,"HR"),
                new Emp(3,"Rahul",54,22000,"Tech"),
                new Emp(4,"Priya",20,100000,"Finance"),
                new Emp(5,"Vikas",39,86000,"Tech"),
                new Emp(6,"Sneha",24,23000,"Marketing"),
                new Emp(7,"Arjun",21,75000,"Tech")
        );

        List<Emp> collect = emps.stream()
                .filter(emp -> emp.getAge() > 30 && emp.getSalary() > 75000)
                .collect(Collectors.toList());
        System.out.println(collect);

//        2 -> Given a string of text or a List, write a Lambda expression to find the
//        frequency of each character (or word) and return the result as a Map.

        List<String> list = List.of("My" ,"Name", "is", "Surya", "is");

        Map<String, Long> frequnecyMap = list.stream()
                .collect(Collectors.groupingBy(l -> l, Collectors.counting()));
        System.out.println(frequnecyMap);

        // Also  first Program to Find the Frequency of Each Character in a Given String

        String str = "Hello Surya";
        IntStream chars = str.chars();


        Map<Character, Long> characterLongMap = chars.mapToObj((ch) -> (char) ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(characterLongMap);

//        “String.chars() returns an IntStream of the Unicode values
//        of each character. Since I want to work with Character objects,
//        I use mapToObj(ch -> (char) ch) to convert each integer
//        into a Character.  Then I use
//    Collectors.groupingBy(Function.identity(), Collectors.counting()). Function.identity()
//        tells the collector to use each character itself as the map key,
//        while Collectors.counting() counts how many times each key appears.
//                The final result is a Map<Character, Long> where each character
//        is associated with its frequency.”

        Map<Character, Long> longMap = str.chars().mapToObj(ch -> Character.toLowerCase((char) ch))
                .filter(ch -> ch != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(longMap);


        // 3 -> Given a list of Employee objects, use Lambda expressions to sort the list first by their
        // department in alphabetical order, and then by their salary in descending order.

        List<Emp> sortList = emps.stream()
                .sorted(Comparator.comparing(Emp ::getDepartment))
                .sorted(Comparator.comparing(Emp :: getSalary).reversed()).collect(Collectors.toList());
        System.out.println(sortList);

        System.out.println("------------------------------------------------------------------------------------------------");

        // 4 ->  Using Lambda expressions and Streams, write a query to find the
        // highest-paid employee in each department from a List.
        // The output should be a Map or Map> where the key is the department name.

        Map<String, Optional<Emp>> highestPaidEmployee = emps.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .collect(Collectors.groupingBy(Emp::getDepartment, Collectors.maxBy(Comparator.comparing(Emp::getSalary))));

        System.out.println(highestPaidEmployee);

        // 5 -> Imagine you have a List, where each Order contains a List. Write a Lambda expression to extract a single flat,
        // deduplicated List of all the item names across all orders, sorted alphabetically.

        List<String> order1 = Arrays.asList("Laptop","Mouse","Keyboard");
        List<String> order2 = Arrays.asList("Mouse","Monitor");
        List<String> order3 = Arrays.asList("Laptop","Mobile","Headphones");

        List<List<String>> finalOrders = Arrays.asList(order1,order2,order3);

        List<String> finalResult = finalOrders.stream()
                .flatMap(order -> order.stream()).distinct().sorted().collect(Collectors.toList());

        System.out.println(finalResult);

        System.out.println("------------------------------------------------------------------------------------------------");

       // 6 -> Create your own custom @FunctionalInterface called MathOperation
        // that takes two integers and returns an integer. Then, write a method
        // that takes two integers and a MathOperation as parameters. Finally,
        // execute this method using different Lambda expressions to perform
        // addition, multiplication, and subtraction.

        int addition = performOperation(5, 7, (a,b) -> a + b);
        System.out.println(addition);
        
        int substraction = performOperation(12,8,(a,b) -> a - b);
        System.out.println(substraction);

        int multiplication = performOperation(18,10,(a,b) -> a * b);
        System.out.println(multiplication);
    }
}
