package InterviewQuestions;

// Interview Question -> FlatMap Method


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LaunchQuestion32 {
    public static void main(String[] args) {

        // flatMap()
        List<Integer> lst1 = Arrays.asList(1,2);
        List<Integer> lst2 = Arrays.asList(3,4);
        List<Integer> lst3 = Arrays.asList(5,6);

        List<List<Integer>> finalList = Arrays.asList(lst1,lst2,lst3);

        List<Integer> finalResult = finalList.stream()
                .flatMap(lst -> lst.stream()).toList();
        System.out.println(finalList);
    }
}
