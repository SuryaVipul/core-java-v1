package oops.interfaces;

interface Calculator{
    void sub();
}
interface C {

}
//interface Calc implements Calculator // one interface cannot implements another interface '
//interface Calc extends Calculator  // but one interface can extends another interface
//interface Calc extends C, Calculator // interface can extends multiple other interfaces
interface Calc
{
    //floor pie = 3.14;  // inside an interface the variables will be considered as public final static float pi = 3.14; by default
    // by default all the methods are abtratct in an interface
    void add(int a, int b);
    int mult(int a, int b);
}

abstract class TeluskoLearning {
    public void add(int a, int b) {

    }

    public abstract void sub();
}

//class MyCalc implements Calc, Calculator  // A class can implements multiple interfaces
class MyCalc  extends TeluskoLearning implements Calc
{
        public void add(int a, int b){
            int c = a + b;
            System.out.println("add result is "+c);
        }
        public int  mult(int a, int b) {
            return a * b;
        }

    @Override
    public void sub() {

    }
}
class MyCalc2 implements Calc {
    public void add(int a, int b){
        int c = a + b + 100;
        System.out.println("add result is "+c);
    }
    public int  mult(int a, int b) {
        return a * b * 100;
    }
}

public class LaunchInterface1 {
    public static void main(String[] args) {
       // Calc c= new Calc();
        Calc c1 = new MyCalc();
        c1.add(4,4);
        System.out.println(c1.mult(4,4));
        Calc c2 = new MyCalc2();
        c2.add(4,4);
        System.out.println(c2.mult(4,4));
    }
}
