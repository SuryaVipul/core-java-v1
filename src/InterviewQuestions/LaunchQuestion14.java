package InterviewQuestions;

// Interview Question -> String vs StringBuilder vs StringBuffer in Java


public class LaunchQuestion14 {
    public static void main(String[] args) {
        String s1 = "Hello";
        s1.concat("World"); // Immutable

        StringBuffer s2 = new StringBuffer("Hello");
        s2.append("World");   // Mutable

        StringBuilder s3 = new StringBuilder("Hello");
        s3.append("World");  // Mutable

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println("*************************");

        String s4 = new String("Hello"); // stores in the scp and heap
        String s5 = new String("Hello"); // stores in the scp and heap

        StringBuffer s6 = new StringBuffer("Hello"); // stores only in the heap
        StringBuffer s7 = new StringBuffer("Hello"); // stores only in the heap

        StringBuilder s8 = new StringBuilder("Hello"); // stores only in the heap
        StringBuilder s9 = new StringBuilder("Hello"); // stores only in the heap

        System.out.println(s4 == s5); // it compare
        System.out.println(s6 == s7);
        System.out.println(s8 == s9);

        System.out.println(s4.equals(s5));
        System.out.println(s6.equals(s7));
        System.out.println(s8.equals(s9));

        System.out.println("*************************");

        String s10 = "Hello";
        String s11 = "Hello";

        System.out.println(s10 == s11);
        System.out.println(s10.equals(s11));

    }
}
