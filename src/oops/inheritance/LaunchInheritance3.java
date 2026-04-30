package oops.inheritance;

// multilevel inheritance concept
class Telusko  // extends Object
{
    void course() {
        System.out.println("This is Telusko class");
    }
}
class Alpha extends Telusko{
    int age;

    private String name;
    void disp(){
        System.out.println("This is Alpha class");
    }
}

class Beta extends Alpha{

    void show(){
        age = 20;
        //name = "Vipul";
        //System.out.println(age + " " + name);
        System.out.println(age);

    }
}

public class LaunchInheritance3 {
    public static void main(String[] args) {
        Beta beta = new Beta();
        beta.disp();
        beta.show();
        beta.course();
        beta.toString(); // parent class object method called here because of multilevel inheritance
                        // Object is a parent class of all classes in java
    }
}
