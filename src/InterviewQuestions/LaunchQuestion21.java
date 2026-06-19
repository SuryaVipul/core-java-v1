package InterviewQuestions;

// Interview Question -> Lambda Expression (Java 8 feature) in java

@FunctionalInterface
interface Vehicle {
    void start();
}

class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Bike engine started");
    }
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car engine started ");
    }
}

class Demo {
//    public void demo(){
//        Bike b = new Bike();
//        b.start();
//    }

    public void demo() {
        // anonymous inner class
//        Vehicle v = new Vehicle() {
//            @Override
//            public void start() {
//                System.out.println("Vehicle engine started");
//            }
//        };
//
//        v.start();


        // Now the lambda expression is an improvement of using above inner class

        Vehicle v = () -> System.out.println("Vehicle Engine started");
        v.start();
    }
}

public class LaunchQuestion21 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.demo();
    }
}
