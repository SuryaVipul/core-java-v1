package InterviewQuestions;

// Interview Questions -> Functional Interfaces - Predicate, Function, Consumer, Supplier


import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LaunchQuestion23 {
    public static void main(String[] args) {
        System.out.println("Predicate Interface");
        // Predicate Interface

        Predicate<Integer> t1 = (num) -> num % 2 == 0;

        System.out.println(t1.test(10));
        System.out.println(t1.test(7));

        Predicate<String> p2 = (str) -> str.isEmpty();

        System.out.println(p2.test(""));
        System.out.println(p2.test("Surya"));

        System.out.println("---------------------------------------------");
        System.out.println("Function Interface");
        // Function Interface

        Function<String,Integer> f1 = (str) -> str.length();

        System.out.println(f1.apply("Surya"));

        Function<Integer, Integer> f2 = (num) -> num * num;

        System.out.println(f2.apply(10));

        System.out.println("---------------------------------------------");
        System.out.println("Consumer Interface");
        // Consumer Interface

        Consumer<String> c1 = (name) -> System.out.println("My name is "+name);

        c1.accept("Surya");

        Consumer<Integer> c2 = (age) -> System.out.println("My age is "+ age);

        c2.accept(28);

        System.out.println("---------------------------------------------");
        System.out.println("Supplier Interface");
        // Supplier Interface

        Supplier<Integer> s1 = () -> (int) Math.random() ;

        System.out.println(s1.get());

        Supplier<String> s2 = () ->{
            String a = "Surya";
            String b = " Shukla";
            return a.concat(b);
        };

        System.out.println(s2.get());
    }
}
