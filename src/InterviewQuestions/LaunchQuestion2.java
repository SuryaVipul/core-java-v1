package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LaunchQuestion2 {
    public static void main(String[] args) {

        // swap numbers without using 3rd variable.
        int a = 5, b = 7;
        System.out.println("Before swap:- " + " a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap:- " + " a = " + a + " b = " + b);
        System.out.println();
        System.out.println("Swap a list using Collections");
        // swapping a list
        List<Integer> list = Arrays.asList(1,2,3);
        Collections.swap(list,0,2);
        System.out.println(list);
    }
}
