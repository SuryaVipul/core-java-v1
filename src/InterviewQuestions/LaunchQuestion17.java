package InterviewQuestions;

// Interview Question -> Java List vs Set vs Map | Difference Between List, Set & Map in Java


/*
List :-
1. It is an interface. Some of its implementations are ArrayList, LinkedList, Vector etc.
2. It maintains insertion order.
3. It allows duplicate values.
4. It allows multiple null values.
5. It extends Collection interface.
6. It does not use Hashing.
7. It is internally backed by a resizable array.

Set :-
1. It is also an interface. Some of its implementations are HashSet, TreeSet, LinkedHashSet etc.
2. It does not maintain insertion order.
3. It does not allow duplicate values.
4. It allows one null value.
5. It extends Collection interface.
6. It uses Hashing.
7. It is internally backed by a HashMap, where each element is considered a key.

Map :-
1. It is also an interface. Some of its implementations are HashMap, HashTable, LinkedHashMap etc.
2. It does not maintain insertion order.
3. It does not allow duplicate keys.
4. It allows one null key but multiple null values.
5. It does not extend Collection interface.
6. It uses Hashing.
7. It is internally implemented as an array of buckets where each bucket is a LinkedList.

 */

import java.util.*;

public class LaunchQuestion17 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(-9);
        list.add(11);
        list.add(11);
        list.add(null);
        list.add(null);

        Set<Integer> set = new HashSet<>();
        set.add(4);
        set.add(7);
        set.add(6);
        set.add(27);
        set.add(27);
        set.add(null);
        set.add(null);


        Map<Integer, Integer> map = new HashMap<>();
        map.put(2,7);
        map.put(3,17);
        map.put(12,-7);
        map.put(-5,9);
        map.put(2 ,8);
        map.put(19,8);
        map.put(null,7);
        map.put(null,12);

        System.out.println("List :- ");
        list.forEach( element -> System.out.println(element));

        System.out.println("-----------------------------------");

        System.out.println("Set :- ");
        set.forEach(element -> System.out.println(element));

        System.out.println("-----------------------------------");

        System.out.println("Map :- ");
        map.forEach((key,value) -> System.out.println("Key : "+ key + " Value : " + value));
    }
}
