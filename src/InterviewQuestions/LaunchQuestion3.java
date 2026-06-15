package InterviewQuestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Count{
    public Map<String, Integer> countWords(String input) {
        Map<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");
        for (String word : words){
            wordCount.put(word,wordCount.getOrDefault(word,0) + 1);
        }
        return wordCount;
    }
}

public class LaunchQuestion3 {
    public static void main(String[] args) {
        //count the number of words in a string using
        //HashMap
        Count c = new Count();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value:- ");
        String s = sc.nextLine();
        Map<String,Integer> result = c.countWords(s);
        for (String key : result.keySet()) {
            System.out.println(key + " : " + result.get(key));
        }
        System.out.println("\nTotal Unique Words: " + result.size());
        sc.close();
        System.out.println();

       String str = "Hi Surya You were nice yesterday";
       String result1 = Arrays.toString(str.split("\\s+"));
      System.out.println(result1.toString());

    }
}
