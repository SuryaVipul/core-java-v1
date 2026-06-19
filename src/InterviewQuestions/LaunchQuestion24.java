package InterviewQuestions;

// Interview Question -> Method Reference vs Lambda in Java 8 - Static, Instance, Constructor

import java.util.PrimitiveIterator;

interface Calculator1 {
    int calculate(int a, int b);
}

@FunctionalInterface
interface Validator {
    boolean validate(int num);
}

@FunctionalInterface
interface StringOperations {
    int operate(String str);
}

@FunctionalInterface
interface Creator<T> {
   T create(String name);
}

class MathOperations {
    public static int add(int a, int b) {
        return a + b;
    }
    public static int multiply(int a, int b) {
        return a * b;
    }

    public boolean isPositive(int num) {
        return num > 0;
    }
}

class User {
    String name;

    public User(String name) {
        this.name = name;
    }
}

class Product {
    String productName;

    public Product(String productName) {
        this.productName = productName;
    }
}

public class LaunchQuestion24 {
    public static void main(String[] args) {
        // types of Method reference
        System.out.println("Method Reference ");
        Calculator1 calc1 = (num1,num2) -> {
          return  MathOperations.add(num1,num2);
        };
        System.out.println(calc1.calculate(10,20));

        // Static Method Reference
        Calculator1 calc2 = MathOperations :: add;
        System.out.println(calc2.calculate(10,20));

        Calculator1 calc3 = (a,b) -> {
            return MathOperations.multiply(a,b);
        };
        System.out.println(calc3.calculate(5,7));

        // Static Method Reference
        Calculator1 calc4 = MathOperations ::multiply;
        System.out.println(calc4.calculate(5,7));

        // implen using Lambda
        MathOperations m1 = new MathOperations();
        Validator v1 = (num) -> {
          return  m1.isPositive(num);
        };
        System.out.println(v1.validate(10));
        System.out.println(v1.validate(-2));

        // Instance Method reference (of a Particular object)
        Validator v2 = m1::isPositive;
        System.out.println(v2.validate(10));
        System.out.println(v2.validate(-2));

        StringOperations s1 = (str) -> {
            return  str.length();
        };
        System.out.println(s1.operate("Surya"));

        StringOperations s2 = String ::length;
        System.out.println(s2.operate("Surya"));

        StringOperations s3 = (str) -> {
            return str.hashCode();
        };
        System.out.println(s3.operate("Surya"));

        StringOperations s4 = String::hashCode;
        System.out.println(s4.operate("Surya"));


        Creator<User> c1 = (name) -> {
          return new User(name);
        };
        User u1 = c1.create("Surya");
        System.out.println(u1.name);

        // Constructor Method Reference
        Creator<User> c2 = User ::new;

        User u2 = c2.create("Vipul");
        System.out.println(u2.name);

        Creator<Product> c3 = (name) -> {
            return new Product(name);
        };
        Product p1 = c3.create("Apple Watch");
        System.out.println(p1.productName);

        Creator<Product> c4 = Product::new;
        Product p2 = c4.create("Samsung Watch");
        System.out.println(p2.productName);

    }
}
