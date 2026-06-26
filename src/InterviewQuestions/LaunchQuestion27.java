package InterviewQuestions;

// Interview Questions -> Java 8 Streams - Lazy Loading, Parallel Streams & More

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


class Employee3 {
    private int id;
    private String name;
    private String department;

    public Employee3(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
}

public class LaunchQuestion27 {
    public static void main(String[] args) {
        Predicate<Integer> p1 = (num) ->  num % 2 == 0;
        System.out.println(p1.test(8));

        Function<Integer,Integer> f1 = (num) ->  num * num;
        System.out.println(f1.apply(8));

        Consumer<Integer> c1 = System.out::println;
        c1.accept(8);

        Supplier<Integer> s1 = () -> (int) Math.random();
        System.out.println(s1.get());

        // Now Starts Stream here from below
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));

       list.stream().forEach((ele -> System.out.print(ele + " ")));

        System.out.println();

       list.stream().filter((ele) -> ele%2 == 0)
               .forEach((ele) -> System.out.print(ele + " "));

        System.out.println();

        list.stream().filter((ele) -> ele % 2 == 0)
                .map((ele) -> ele * ele)
               .forEach((ele) -> System.out.print(ele + " "));

        System.out.println();
        System.out.println();


        List<Employee3> employees = Arrays.asList(
                new Employee3(1,"Amit","Tech"),
                new Employee3(2,"Neha","HR"),
                new Employee3(3,"Rahul","Tech"),
                new Employee3(4,"Priya","Finance"),
                new Employee3(5,"Vikas","Tech"),
                new Employee3(6,"Sneha","Marketing"),
                new Employee3(7,"Arjun","Tech")
        );

        employees.stream().filter((emp) -> emp.getDepartment().equals("Tech"))
                .map((emp) -> emp.getName())
                .forEach(System.out :: println);
        System.out.println();

        // use of collect() method
//        List<String> names = employees.stream().filter((emp) -> emp.getDepartment().equals("Tech"))
//                .map((emp) -> emp.getName())
//                        .collect(Collectors.toList());
//        System.out.println(names);

        // count
        long count = list.stream()
                .filter((element) -> element % 2 == 0)
                .map((elem) -> elem * elem)
                .count();
        System.out.println(count);

        System.out.println();

        // findFirst()
        List<String> nameList = new ArrayList<>(Arrays.asList("Aman","Raj","Rohit","Riya","Rahul","Ankit","Rina","Reshma"));
        Optional<String> first = nameList.stream().findFirst();
        System.out.println(first.get());

        Optional<String> first1 = nameList.stream()
                .filter((str) -> str.startsWith("R"))
                .findFirst();
        System.out.println(first1.get());

        // findAny()
        Optional<String> f = nameList.stream()
                .findAny();
        System.out.println(f.get());

        // sorted()
        List<Integer> numList = new ArrayList<>(Arrays.asList(3,2,-2,45,21,17));
        numList.stream().sorted()
                .forEach((num) -> System.out.println(num));

        System.out.println();

        // parallelStream

        nameList.parallelStream().filter((str) -> str.startsWith("R"))
                .forEach((name) -> System.out.println(name));


    }
}
