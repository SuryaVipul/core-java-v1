package InterviewQuestions;

// Q #1) Write a Java Program to reverse a string without using String inbuilt function.


// 1.In Java, the toCharArray() method of the String class converts the given string
// into a character array. The returned array length is equal to the length of the
// string. This is helpful when we need to work with individual characters of a
// string for tasks like iteration or modification.


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

class ReverseString {
    public String reverseString(String input) {
        char[] chars = input.toCharArray();
        System.out.println(chars);
        int left = 0, right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}

public class LaunchQuestion1 {
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();
        String s = "Surya";
        System.out.println("Reverse of given String is:- "+ rs.reverseString(s));

        // Reverse a String Using charAt() method
        String r = "";
        for (int i = 0; i < s.length(); i++) {
            r = s.charAt(i) + r;
        }
        System.out.println("Reverse a String using charAt():- "+r);

        // Reverse a String Using StringBuilder() method
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        System.out.println("Reverse a String using StringBuilder:- "+sb);

        // Reverse a String Using toCharArray to copy elements
        System.out.println("Reverse a String using toCharArray() below:- ");
        char [] arr = s.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i]);
        }

        System.out.println();

        // Using Collections.reverse()
        char[] arr1 = s.toCharArray();
        List<Character> list = new ArrayList<>();
        for (char c : arr1){
            list.add(c);
        }
        System.out.println("list:- "+list);
        Collections.reverse(list);
        ListIterator itr = list.listIterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
