package InterviewQuestions;

// Interview Question -> Why Are Strings Immutable in Java
public class LaunchQuestion13 {
    public static void main(String[] args) {
        String name = "Surya";
        String name1 = "Surya";
        String name2 = "Surya";

        System.out.println(name == name1);
        System.out.println(name == name2);

        name = "Vipul";
        System.out.println(name);
        System.out.println(name1);

        System.out.println(name == name1);
        System.out.println(name == name2);
        System.out.println(name1 == name2);


    }
}
