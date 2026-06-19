package InterviewQuestions;

// Interview Questions -> Functional Interface,Lambda Expressions, @FunctionalInterface, Anonymous Class

// The interface which contains only 1 abstract method, that method called as functional interface.
// Although it can have default methods and static method also.

@FunctionalInterface
interface Vehicle1 {
    void start();

    default void method2(){
        System.out.println("default method inside functional interface");
    }
    static void method3() {
        System.out.println("static method inside functinal interface");
    }
}

@FunctionalInterface
interface Greetings {
    void greet();
}

@FunctionalInterface
interface Task {
    void execute();
}

@FunctionalInterface
interface Square{
    int operate(int number);
}

@FunctionalInterface
interface Calculator{
    int add(int num1, int num2);
}


//class Car1 implements Vehicle1 {
//
//    @Override
//    public void start() {
//        System.out.println("Car engine started");
//    }
//}

//class Bike1 implements Vehicle1 {
//
//    @Override
//    public void start() {
//        System.out.println("Bike engine started");
//
//    }
//}

public class LaunchQuestion22 {
    public static void main(String[] args) {
      //  Vehicle1 v1 = new Vehicle1();

//        Vehicle1 v1 = new Car1();
//        v1.start();
//
//        Vehicle1 v2 = new Bike1();
//        v2.start();


        // this is called anonymous inner class implementation

//        Vehicle1 v1 = new Vehicle1() {
//            @Override
//            public void start() {
//                System.out.println("Car Engine started");
//            }
//        };
//        v1.start();
//
//        Vehicle1 v2 = new Vehicle1() {
//            @Override
//            public void start() {
//                System.out.println("Bike Engine started");
//            }
//        };
//        v2.start();

        // using lambda we can even reduce boiler code

        Vehicle1 v1 = () -> System.out.println("Car Engine started");
        v1.start();

        Vehicle1 v2 = () -> System.out.println("Bike Engine started");
        v2.start();

        Greetings greetings = () -> System.out.println("Hello everyone");
        greetings.greet();

        Task task = () -> {
            System.out.println("Tasks Started");
            System.out.println("Tasks ended");
        };
        task.execute();

        Square square = number -> number * number;

        System.out.println(square.operate(5));

        Calculator calculator = (a,b) -> {
            int result = a + b;
            System.out.println("Result "+ result);
                return result;
        };
        calculator.add(10,20);
    }
}
