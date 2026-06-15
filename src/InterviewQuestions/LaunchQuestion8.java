package InterviewQuestions;

import java.util.HashMap;
import java.util.Map;

class Duplicate {
    public void findDuplicates(String input) {
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char ch : input.toCharArray()) {
            charCount.put(ch,charCount.getOrDefault(ch,0) + 1);
        }
        for (Map.Entry<Character,Integer> entry : charCount.entrySet()){
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " appears " +  entry.getValue() + " times");
            }
        }
    }
}

public class LaunchQuestion8 {
    public static void main(String[] args) {
        Duplicate duplicate = new Duplicate();
        String str = "JavavJ";
        duplicate.findDuplicates(str);
    }
}
