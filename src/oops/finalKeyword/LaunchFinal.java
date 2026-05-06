package oops.finalKeyword;

// final class Telusko
 class Telusko{

     final int age = 8;
    public final void courses() {
       // age = 10; Cannot assign a value to final variable 'age'
        System.out.println("telusko has both live and recorded courses");
        System.out.println("age is " + age);
    }
}

// class TeluskoTux extends Telusko
class TeluskoTux extends Telusko {

     // cannot override the final method  from Telusko
//    public void courses() {
//        System.out.println("telusko AI is also getting launched ");
//    }
}

public class LaunchFinal {
    public static void main(String[] args) {
    TeluskoTux t = new TeluskoTux();
    t.courses();
    }
}
