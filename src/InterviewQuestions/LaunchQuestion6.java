package InterviewQuestions;

class Palindrome {
    public boolean isPalindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            char c = input.charAt(right);
            if (input.charAt(left) !=
                    c) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

public class LaunchQuestion6 {
    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        String s = "level";
        boolean result = palindrome.isPalindrome(s);
        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.println();
        // Using String builder
        StringBuilder stringBuilder = new StringBuilder(s);
        stringBuilder.reverse();
        String result1 = stringBuilder.toString();
        if (result1.equalsIgnoreCase(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
        System.out.println();
    }
}
