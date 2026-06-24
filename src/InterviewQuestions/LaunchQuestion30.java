package InterviewQuestions;

// Interview Question -> Move Zero Element to end using java 8 features.

// Interview Question -> We have one map with a String key and Integer value needs
// to sort the Map by value not key. -- use java 8 feature to solve this question

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LaunchQuestion30 {
    public static void main(String[] args) {

        // Move Zero Element to end using java 8 features.
        List<Integer> numbers = List.of(1,0,-3,0,5,-2,0,8,0,-4);

        List<Integer> moveZerosElements = Stream.concat(numbers.stream().filter(n -> n != 0), numbers.stream().filter(n -> n == 0))
                .collect(Collectors.toList());
        System.out.println(moveZerosElements);

        System.out.println();

        // Sorting Map Values Using Java 8 Features -- Multiple ways to do so

        Map<String, Integer> map = new HashMap<>();
        map.put("A",20);
        map.put("B",50);
        map.put("E",10);
        map.put("C",11);
        map.put("R",30);
        map.put("P",40);

        // 1
        map.entrySet().stream()
                .sorted((s1,s2) -> s1.getValue().compareTo(s2.getValue()))
                .toList().forEach(System.out::println);

        System.out.println();

        // 2
        LinkedHashMap<String, Integer> sortedMap = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .collect(Collectors
                        .toMap(Map.Entry::getKey, Map.Entry::getValue,
                                (e1, e2) -> e1, LinkedHashMap::new));
        System.out.println(sortedMap);

    }
}
