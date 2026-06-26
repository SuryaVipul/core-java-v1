package InterviewQuestions;

// Java 8 Interview Imp Coding Questions


import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.partitioningBy;
import static java.util.stream.Collectors.toList;

public class LaunchQuestion31 {
    public static void main(String[] args) {
        /**
         * Separate odd and even numbers in a list of integers.
         *
         * Given a list of integers, write a Java 8 program to separate
         * the odd and even numbers into two separate lists.
         */
        separationOfEvenOddNumberInMap();
        separationOfEvenOddNumberInList();

        /**
         * Remove duplicate elements from a list using Java 8 streams
         *
         * Write a Java 8 program to remove duplicate elements from a list
         * using the stream API and lambda expressions.
         */
        removeDuplicateFromList();

        /**
         * Find the frequency of each character in a string using Java 8 streams
         *
         * Write a Java 8 program to find the frequency of each character in
         * a given string using the stream API and collectors.
         */
        characterFrequency();
    }

    private static void separationOfEvenOddNumberInMap() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Collection<List<Integer>> evenOddList = oneToTen.stream()
                .collect(Collectors.collectingAndThen
                        (partitioningBy(i -> i % 2 == 0), Map::values));
        System.out.println(evenOddList);
    }

    private static void  separationOfEvenOddNumberInList() {
        List<Integer> oneToTen = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Map<Boolean, List<Integer>> evenOddSeparation = oneToTen.stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));
        System.out.println(evenOddSeparation);
    }

    public static void removeDuplicateFromList() {
        List<Integer> oneToTen = List.of(1, 5, 2, 1, 5, 6, 6, 8, 9, 6);

        List<Integer> removeDuplicates = oneToTen.stream()
                .distinct()
                .collect(toList());
        System.out.println(removeDuplicates);

        Set<Integer> removeDuplicatesWithoutOrder = oneToTen.stream()
                .collect(Collectors.toSet());
        System.out.println(removeDuplicatesWithoutOrder);

    }

    private static void characterFrequency() {

    }
}
