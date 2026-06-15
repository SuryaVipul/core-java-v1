package InterviewQuestions;

// Interview Question -> Wrapper classes in java

public class LaunchQuestion11 {
    public static void main(String[] args) {
        int a = 10;
        Integer obj = Integer.valueOf(a); // this is called boxing i.e. manualBoxing

        Integer obj1 = a; // compiler converts here primitive ata type into its objects and compiler is automatically performing
                            // this boxing process that is why it is called autoBoxing

        int x = obj.intValue(); // now this process is called unBoxing i.e. manualUnBoxing
                                // and here we are converted back to its int dataType

        int y = obj1; // this process is called autoUnboxing.


        // some imp methods

        String num = "10";

        Integer obj2 = Integer.valueOf(num);
        int z = Integer.parseInt(num);

        String num1 = obj2.toString();


        Integer i1 = 20;
        Integer i2 = 30;

        System.out.println(i1.compareTo(i2));
        System.out.println(Integer.min(i1,i2));
        System.out.println(Integer.max(i1,i2));

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }
}
