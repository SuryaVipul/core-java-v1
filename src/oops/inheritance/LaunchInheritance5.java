package oops.inheritance;

class Demo1{

    int a, b;

    Demo1(){
        System.out.println("Demo 1 Zero Param Constructor");
    }

    public Demo1(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Demo 1 param constructor");
    }
}

class Demo2 extends Demo1{

    int x,y;
    Demo2() {
        super();
        System.out.println("Demo 2 Zero param Constructor");
    }

    Demo2(int x, int y){
        super(5,5);
        this.x = x;
        this.y = y;
        System.out.println("Demo 2 param constructor");
    }
    void disp(){
        System.out.println("x "+ x + " y " + y);
        System.out.println("a "+ a + " b " + b);
    }
}

public class LaunchInheritance5 {
    public static void main(String[] args) {
    Demo2 d2 = new Demo2(4,5);
    d2.disp();
    }
}
