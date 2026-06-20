package InterviewQuestions;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


// Interview Question -> TOP 20 Questions Java 8 Streams  (Very Imp for Interviews)

class Employee4 {
     String name;
     String department;
     int salary;
    public Employee4(String name, String department, int salary) {
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
        return "Employee4{" +
                "name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class Transaction{
    String category;
    int amount;
    public Transaction(String category, int amount) {
        this.category = category;
        this.amount = amount;
    }
    public String getCategory() {
        return category;
    }
    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "category='" + category + '\'' +
                ", amount=" + amount +
                '}';
    }
}

public class LaunchQuestion28 {
    public static void main(String[] args) {

        // Q1 -> remove duplicates and sort them in descending order

        List<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 1, 3, 2, 5, 4));

        List<Integer> result = list.stream()
                .distinct().sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(result);

        // Q2 -> find the odd numbers and return there squares
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        List<Integer> result1 = list1.stream()
                .filter((num) -> num % 2 != 0)
                .map((num) -> num * num)
                .collect(Collectors.toList());
        System.out.println(result1);

        // Q3 -> Get the 2nd and 3rd elements from list and return them in a list
        List<Integer> list2 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        List<Integer> result2 = list2.stream()
                .skip(1)
                .limit(2)
                .collect(Collectors.toList());
        System.out.println(result2);

        // Q4 -> Find the 2nd highest number in a list
        List<Integer> list3 = new ArrayList<>(Arrays.asList(20, 10, 10, 45, 30, 45, 5, 20));

        Optional<Integer> result3 = list3.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                //.limit(1)
                .findFirst();

        // null pointer check
        if (result3.isPresent()) {
            System.out.println(result3.get());
        }

        // Q5 -> From a List Divide the numbers into even or odd.
        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Map<Boolean, List<Integer>> booleanListMap = list4.stream()
                .collect(Collectors.partitioningBy(ele -> ele % 2 == 0));
        System.out.println(booleanListMap);

        // Q6 -> From a given list of String, Find the longest string in a list.
        List<String> list5 = new ArrayList<>(Arrays.asList("Java", "SpringBoot", "API"));
        Optional<String> optionalString = list5.stream()
                .max(Comparator.comparing(elem -> elem.length()));

        if (optionalString.isPresent()) {
            System.out.println(optionalString.get());
        }
        System.out.println();
        // Q7 -> From a below list of employees, find the first employees
        //  whose salary is greater then 50000

        List<Employee4> employees = new ArrayList<>(Arrays.asList(
                new Employee4("Abhishek", "IT", 50000),
                new Employee4("Ankit", "IT", 70000),
                new Employee4("Rahul", "HR", 40000),
                new Employee4("Tina", "HR", 45000),
                new Employee4("Esha", "Finance", 60000),
                new Employee4("Naman", "Finance", 55000),
                new Employee4("Sachit", "IT", 80000),
                new Employee4("Pushp", "Marketing", 50000),
                new Employee4("Sumit", "Marketing", 52000)
        ));

        Optional<Employee4> findFirstEmp = employees.stream()
                .filter(emp -> emp.getSalary() > 50000)
                .findFirst();

        if (findFirstEmp.isPresent()) {
            System.out.println(findFirstEmp.get());
        }
        System.out.println();

        // Q8 -> Find top 2 highest paid employees
        List<Employee4> collected = employees.stream()
                .distinct()
                .sorted(Comparator.comparingInt(emp -> -1 * emp.getSalary())) // whenever we want to change the order
                .limit(2)                                                  // we need to multiply them with -1
                .collect(Collectors.toList());

        System.out.println(collected);

        System.out.println();

        // Q9 -> From a list of employees, Sort employees by salary and then by name
        List<Employee4> collected1 = employees.stream()
                .sorted((emp1, emp2) -> {
                    if (emp1.getSalary() > emp2.getSalary()) {
                        return 1;
                    } else if (emp1.getSalary() < emp2.getSalary()) {
                        return -1;
                    } else {
                        return emp1.getName().compareTo(emp2.getName());
                    }
                })
                .collect(Collectors.toList());


        System.out.println(collected1);

        System.out.println();

        // Q10 -> From the list of integer, Find the frequency of each element in a list.
        List<Integer> list6 = new ArrayList<>(Arrays.asList(3, 2, 3, 4, 4, 1, 2, 1, 1, 1, 5, 6, 5));

        Map<Integer, Long> frequencyCount = list.stream()
                .collect(Collectors.groupingBy(elem -> elem, Collectors.counting()));

        System.out.println(frequencyCount);

        System.out.println();

        // Q11 -> Given above list of employees, count how many employees are in each department
        Map<String, Long> empDeptCount = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment(), Collectors.counting()));

        System.out.println(empDeptCount);

        System.out.println();

        // Q12 -> Given below a list of Transactions, Find Total transaction amount per Category.
        List<Transaction> transactions = Arrays.asList(
                new Transaction("Food", 100),
                new Transaction("Food", 200),
                new Transaction("Food", 150),
                new Transaction("Shopping", 300),
                new Transaction("Shopping", 250),
                new Transaction("Shopping", 100),
                new Transaction("Utilities", 400),
                new Transaction("Utilities", 300),
                new Transaction("Entertainment", 500),
                new Transaction("Entertainment", 200),
                new Transaction("Travel", 700),
                new Transaction("Travel", 300)
        );

        Map<String, Integer> sumOfTotalTxn = transactions.stream()
                .collect(Collectors.groupingBy(txn -> txn.getCategory()
                        , Collectors.summingInt(txn -> txn.getAmount())));

        System.out.println(sumOfTotalTxn);

        System.out.println();

        // Q13 -> Given a above list of employees, find the avg sal of employees
        // in each department.

        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment()
                        , Collectors.averagingInt(emp -> emp.getSalary())));

        System.out.println(avgSalary);

        System.out.println();

        // Q14 -> Given above a list of employees, find the highest paid
        // employees in each department.

        Map<String, Optional<Employee4>> maxByEveryDept = employees.stream()
                .collect(Collectors.groupingBy(emp -> emp.getDepartment()
                        , Collectors.maxBy(Comparator.comparingInt(emp -> emp.getSalary()))));

        System.out.println(maxByEveryDept);

        System.out.println();

        //Q15 -> Given a list of employees, Convert the list into
        // a comma-separated string of Employee names.

        String names = employees.stream()
                .map(emp -> emp.getName())
                .collect(Collectors.joining(","));

        System.out.println(names);

        System.out.println();

        //Q16 -> Given two Lists, Find Common elements
        // between them

        List<Integer> list7 = Arrays.asList(1,2,3,4);
        List<Integer> list8 = Arrays.asList(3,4,5,6);

        // 1st way
//        List<Integer> commonList = list8.stream()
//                .filter(elem -> list7.contains(elem))
//                .collect(Collectors.toList());

 //       System.out.println(commonList);

        // 2nd way
        Set<Integer> set = new HashSet<>(list7);
        List<Integer> collect = list8.stream().filter(elem -> set.contains(elem))
                .collect(Collectors.toList());

        System.out.println(collect);

        System.out.println();

        // Q17 -> you have a list of lists below. convert it into a single list
        // with all the elements. remove duplicates if any.
        List<List<Integer>> listOfLists = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(3,4,5,6),
                Arrays.asList(7,8,1,2),
                Arrays.asList(9,10,5,6),
                Arrays.asList(11,12,7,8)
        );

        List<Integer> integerList = listOfLists.stream()
                .flatMap(innerList -> innerList.stream())
                .distinct()
                .collect(Collectors.toList());

        System.out.println(integerList);

        System.out.println();

        // Q18 -> Given above list of employees, print all their
        // names. Their order doesn't matter but the operation should
        // be very fast.

        employees.parallelStream()
                .map(emp -> emp.getName())
                .forEach(name -> System.out.println(name));

        System.out.println();

        // Q19 ->  in below code, find the error.

        List<Integer> list9 = new ArrayList<>();

        IntStream.range(1,1000)
                .parallel()
                .forEach(elem -> list9.add(elem));

        System.out.println();

        // Q20 -> Given above list of employees, compute total
        // combined salary of all the employees. Operation should
        // be very fast.

        Integer reduce = employees.parallelStream()
                .map(emp -> emp.getSalary())
                .reduce(0, (a, b) -> a + b);

        System.out.println(reduce);
    }
}
