package InterviewQuestions;

// Interview Question ->  == vs .equals() in Java

public class LaunchQuestion12 {
    public static void main(String[] args) {
        String name1 = "Surya";
        String name2 = "Surya";

        System.out.println(name1 == name2); // it is true because it is not comparing values it actually compares the addresses
                                            // so the addresses are same in scp.

        System.out.println(name1.equals(name2));

        String str1 = new String("Vipul");
        String str2 = new String("Vipul");

        System.out.println(str1 == str2); // it is false because it will create 2 diff objects in the heap memory.

        System.out.println(str1.equals(str2));

        String name3 = "Naman";
        String name4 = new String("Naman");

        System.out.println(name3 == name4);
        System.out.println(name3.equals(name4));

        String name5 = new String("Naman");
        name5 = "Naman";

        System.out.println(name3 == name5);
        System.out.println(name3.equals(name5));

        name5 = null;

        System.out.println(name3 == name5);
        System.out.println(name3.equals(name5));

        String s1 = "Hello";
        String s2 = s1+"World";

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

    }
}
