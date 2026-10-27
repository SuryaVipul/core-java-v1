package Stream.ImpQuestions;

import javax.swing.text.html.Option;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchStream7 {
    public static void main(String[] args) {

        // Super easy
        System.out.println("-------------------SECTION 1 -------------------");

        List<String> names = Arrays.asList("Surya", "Vipul", "Jaya");
        // 1. List -> Stream
        Stream<String> stream = names.stream();

        String[] arr = {"Java", "C++", "Python"};
        // 2. Array -> Stream
        Stream<String> stream1 = Arrays.stream(arr);

        // 3. Stream of
        Stream<Integer> integerStream = Stream.of(1, 2, 3);

        // Stream generate
        Stream<Double> limit = Stream.generate(Math::random).limit(5);

        // Filter even numbers using Stream
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> even = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("\nevenList -> " + even);

        // convert numbers in list to their squares
        List<Integer> numbers1 = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squares = numbers1.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println("squares -> " + squares);

        // square even numbers from list
        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenSquares = numbers2.stream()
                .filter(num -> num % 2 == 0)
                .map(n -> n * n)
                .toList();

        System.out.println("evenSquares -> " + evenSquares);

        // find the first number greater than 10 from list
        List<Integer> numbers3 = Arrays.asList(3, 7, 12, 11, 20);

        Optional<Integer> firstNumGreaterThan10 = numbers3.stream()
                .filter(num -> num > 10)
                .sorted()
                .findFirst();
        System.out.println("firstNumGreaterThan10 -> " + firstNumGreaterThan10.get());

        // Count how many numbers are greater than 5 in the list
        List<Integer> numbers4 = Arrays.asList(2, 6, 3, 8, 10, 1);

        long countValueGreaterThen5 = numbers4.stream()
                .filter(num -> num > 5)
                .count();
        System.out.println("countValueGreaterThen5 -> " + countValueGreaterThen5);

        //find the sum/product of all numbers in the list
        List<Integer> numbers5 = Arrays.asList(1, 2, 3, 4, 5);

        Integer sum = numbers5.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println("sum -> " + sum);

        // find sum of even number in list
        Integer sumOfEvenNumbers = numbers5.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("sumOfEvenNumbers -> " + sumOfEvenNumbers);

        // find the maximum number in list
        List<Integer> numbers6 = Arrays.asList(5, 10, 2, 8, 20);

        Optional<Integer> max = numbers6.stream()
                .reduce((a, b) -> Integer.max(a, b));

        System.out.println("Maximum -> " + max.get());


        // sum of squares of even numbers in list
        List<Integer> numbers7 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Integer SumEvenSquares = numbers7.stream()
                .filter(num -> num % 2 == 0)
                .map(n -> n * n)
                .reduce(0, (a, b) -> a + b);

        System.out.println("Sum of Even numbers squares -> " + SumEvenSquares);

        // Easy level
        System.out.println("\n-------------------SECTION 2 -------------------");

        // find all distinct elements from a list(remove duplicates).
        List<Integer> numbers8 = Arrays.asList(5, 2, 8, 2, 3, 5, 9, 3);

        List<Integer> distinctList = numbers8.stream()
                .distinct()
                .toList();

        System.out.println("Remove duplicates -> " + distinctList);

        // find the average of all the numbers in a list
        List<Integer> numbers9 = Arrays.asList(5, 10, 15, 20, 25);

        double avg = numbers9.stream()
                .mapToInt(n -> (int) n)
                .average()
                .orElse(0.0);

        System.out.println("Average -> " + avg);

        // sort a list of integers in asc and desc order using streams
        List<Integer> numbers10 = Arrays.asList(5, 1, 8, 3, 1, 2, 10);

        List<Integer> sortInAsc = numbers10.stream()
                .distinct()
                .sorted()
                .toList();
        System.out.println("Asc order sort -> " + sortInAsc);

        List<Integer> sortInDesc = numbers10.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Desc order sort -> " + sortInDesc);

        // count how many streams start with a specific letter(Like 'A').
        List<String> fruits = Arrays.asList("Apple", "Banana", "Avocado", "Mango", "Apricot");

        long countFruitsStartsWithA = fruits.stream()
                .filter(fruit -> fruit.startsWith("A"))
                .count();

        System.out.println("Count Fruits Starts With 'A' -> " + countFruitsStartsWithA);

        // join all strings in a list into a single comma-separator string
        List<String> fruits1 = Arrays.asList("Apple", "Banana", "Mango", "Orange");

        String joined = fruits1.stream()
                .collect(Collectors.joining(",", "[", "]"));

        System.out.println("Join string -> " + joined);

        // check if all elements are positive numbers
        List<Integer> numbers11 = Arrays.asList(5, 10, 3, 8, 2);

        boolean match = numbers11.stream()
                .allMatch(n -> n > 0);

        System.out.println("positive numbers in a list? -> " + match);

        // check if any number is divisible by 3
        List<Integer> numbers12 = Arrays.asList(5, 7, 9, 10, 14);

        boolean isDivisibleBy3 = numbers12.stream()
                .anyMatch(n -> n % 3 == 0);

        System.out.println("is divisible by 3? -> " + isDivisibleBy3);

        // Flatten the list of list
        List<List<Integer>> listoflist = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(4, 5),
                Arrays.asList(6, 7, 8)
        );

        List<Integer> flattenList = listoflist.stream()
                .flatMap(List -> List.stream())
                .toList();

        System.out.println("flatten the list -> " + flattenList);

        // find the first non-empty string in a list
        List<String> strings = Arrays.asList("", "", "Hello", "Surya", "");

        Optional<String> nonEmptyFirstString = strings.stream()
                .filter(s -> !s.isEmpty())
                .findFirst();

        System.out.println("Non-Empty string -> " + nonEmptyFirstString.get());

        // find the second-highest number in a list using streams
        List<Integer> numbers13 = Arrays.asList(5, 9, 11, 2, 8, 21, 19, 1);

        Optional<Integer> secondHighest = numbers13.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst();

        System.out.println("Second Highest number -> " + secondHighest.get());


        // Intermediate A  Level
        System.out.println("\n-------------------SECTION 3 -------------------");

        // Sort List of Employees By Salary
        List<Employee> employees = Arrays.asList(
                new Employee(101, "John", 50000),
                new Employee(102, "Alice", 70000),
                new Employee(103, "Bob", 45000),
                new Employee(104, "David", 90000)
        );

        List<Employee> list = employees.stream()
                .sorted(Comparator.comparing(e -> e.getSalary()))
                .toList();

        System.out.println("sort the emp by salary in asc -> " + list);

        List<Employee> list1 = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();

        System.out.println("sort the emp by salary in desc -> " + list1);

        // calculate the average age of a list of Person
        // objects using java streams
        List<Person> people = Arrays.asList(
                new Person("Alice", 25),
                new Person("Bob", 30),
                new Person("Charlie", 28),
                new Person("David", 35)
        );

        double avg1 = people.stream()
                .mapToInt(person -> person.getAge())
                .average()
                .orElse(0.0);

        System.out.println("Average of person's age -> " + avg1);


        // Partition numbers in even or odd list
        List<Integer> numbers14 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> collected = numbers14.stream()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));

        System.out.println("Even numbers -> " + collected.get(true));
        System.out.println("Odd numbers -> " + collected.get(false));

        // Group a list of words by their length using Streams.
        List<String> words = Arrays.asList("apple", "bat", "ball", "cat", "banana", "dog", "goat");

        Map<Integer, List<String>> collect = words.stream()
                .collect(Collectors.groupingBy(str -> str.length()));

        System.out.println("group a list of words by their length -> " + collect);

        // count occurrences of each element in a list
        List<String> items = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> stringLongMap = items.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("count occurrences of each element -> " + stringLongMap);

        // Group employees by department and calculate average salary
        List<Employee1> employees1 = Arrays.asList(
                new Employee1(1, "John", "HR", 50000),
                new Employee1(2, "Jane", "IT", 70000),
                new Employee1(3, "Mike", "IT", 80000),
                new Employee1(4, "Sara", "Finance", 60000),
                new Employee1(5, "Paul", "HR", 55000)
        );

        Map<String, Double> doubleMap = employees1.stream()
                .collect(Collectors.groupingBy(employee -> employee.getDepartment(),
                        Collectors.averagingDouble(employee -> employee.getSalary())));

        System.out.println("group employees by dept and calc average salary -> " + doubleMap);


        // Intermediate B Level
        System.out.println("\n-------------------SECTION 4 -------------------");

        // Find the Highest-Paid Employee in each department

        Map<String, Optional<Employee1>> collect1 = employees1.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment,
                        Collectors.maxBy(Comparator.comparing(Employee1::getSalary))));

        System.out.println("highest paid emp by each dept -> " + collect1);

        // find all departments with more than 2 employees
        List<Employee1> employees2 = Arrays.asList(
                new Employee1(1, "John", "IT", 60000),
                new Employee1(2, "Alice", "HR", 55000),
                new Employee1(3, "Bob", "IT", 75000),
                new Employee1(4, "Carol", "HR", 70000),
                new Employee1(5, "David", "Finance", 65000),
                new Employee1(6, "Eve", "IT", 80000),
                new Employee1(7, "Frank", "Finance", 64000),
                new Employee1(8, "Ala", "Operations", 44000)
        );

        List<String> list2 = employees2.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment
                        , Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 2)
                .map(m -> m.getKey())
                .toList();

        System.out.println("the department with more than 2 emp -> " + list2);

        // find the dept with the highest average salary
        Map.Entry<String, Double> avgSalary = employees2.stream()
                .collect(Collectors.groupingBy(Employee1::getDepartment
                        , Collectors.averagingDouble(Employee1::getSalary)))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("Highest average salary for the dept -> " + avgSalary);

        // find most frequent character in a String
        String input = "banana";

        Map.Entry<Character, Long> characterLongEntry = input.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .orElseThrow();

        System.out.println("most frequent character -> " + characterLongEntry);

        // find first non repeating character in string
        String str = "swiss";

        Optional<Map.Entry<Character, Long>> first = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(),
                        LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst();

        System.out.println("first non repeating character in string "+first);

           // Hard A Level
               System.out.println("\n-------------------SECTION 5 -------------------");

               // find the most common first letter among all employees names.
            List<Employee1> employees3 = Arrays.asList(
                new Employee1(1, "John", "IT", 60000),
                new Employee1(2, "Alice", "HR", 55000),
                new Employee1(3, "Bob", "IT", 75000),
                new Employee1(4, "Carol", "HR", 70000),
                new Employee1(5, "David", "Finance", 65000),
                new Employee1(6, "Eve", "IT", 80000),
                new Employee1(7, "Frank", "Finance", 64000),
                new Employee1(8, "Ala", "Operations", 44000)
            );


    }

    }
