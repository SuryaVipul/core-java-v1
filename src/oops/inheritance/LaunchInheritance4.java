package oops.inheritance;

class Parent {
    void sleep(){
        System.out.println("Sleeps lot");
    }
    void dressingStyle() {
        System.out.println("dresses based on their time");
    }
}

class Child  extends Parent{

    // overriding  //overriden
    void dressingStyle() {
        System.out.println("dresses based on  our modern time");
    }
    void habbit() {
        System.out.println("Child swims well");
    }
}

public class LaunchInheritance4 {
    public static void main(String[] args) {
    //Child ch = new Child();
      Parent ref = new Child(); // Polymorphism
        ref.sleep();
        ref.dressingStyle();
        ((Child) ref).habbit();
    }
}
