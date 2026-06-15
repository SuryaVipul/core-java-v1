package InterviewQuestions;

// Interview Question -> Array vs ArrayList in Java | Which One Should You Use and When?


// Arrays vs ArrayList

/*
Arrays :-
1. Size is fixed at the start in arrays.
2. Arrays can be initialized at the time of declaration using {}.
3. It works with both Objects and Primitives.
4.Fetch can be done using arr[i].
5. No new element can be added at the end.
6. Element cannot be removed.
7. Elements can be replaced using arr[i] = Updated Element;
8. It does not have toString() implemented.
9. Arrays does not implement List interface.

ArrayList :-
1. Size can change dynamically in ArrayList.
2. ArrayList can be initialized at the time of declaration using Arrays.asList().
3. It works only with Objects.
4. Fetch can be done using list.get(i).
5. Element can be added at the end using list.add().
6. Element can be removed using list.remove(i);
7. Element can be replaced using list.set(i,Updated Element)
8. It does have toString() implemented.
9. ArrayList implements List interface.

 */


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Person {
    private int id;
    private String name;
}

public class LaunchQuestion16 {
    public static void main(String[] args) {
        // Arrays
        System.out.println("Arrays: ");
       // int[] numbers = new int[3];
       int[] numbers = {2,7,9};
        System.out.println(numbers[1]);
        System.out.println(numbers.length);

        Integer[] number2 = new Integer[5];
        Person[] persons = new Person[2];

        numbers[0] = 5;

        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        System.out.println();

        System.out.println("*************Difference between Array and ArrayList*******************************");

        // ArrayList
        System.out.println("ArrayList: ");
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 8, 11));
        System.out.println(numbersList.size());
        ArrayList<Person> personList = new ArrayList<>();
        System.out.println(numbersList.get(1));

        numbersList.add(12);
        numbersList.remove(0);

        numbersList.set(2,17);

        System.out.println(numbersList);

        List<Integer> finalList= numbersList.stream().filter((element) -> element % 2 == 0).toList();

        System.out.println(finalList);
        
    }
}
