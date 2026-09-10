package collections.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Practice2 {

    public static void main(String[] args) {

        // HashMap Allowed null key and null values
        HashMap<String, String> map = new HashMap<>();
        map.put(null, "value");
        map.put("key", null);
        System.out.println(map);

        // can we insert duplicate keys ?? Yes. The latest value overrides the old value for the same key.
        map.put("fruit", "apple");
        map.put("fruit", "mango");
        System.out.println(map.get("fruit"));

        // Is HashMap thread Safe ?? The Ans is No.

        // Basic Insertion and Retrieval (put and get)
        HashMap<Integer, String> employeeMap = new HashMap<>();
        employeeMap.put(101, "ALice");
        employeeMap.put(102, "Bob");
        employeeMap.put(103, "Charlie");

        System.out.println(employeeMap.get(102));

        // Checking for Existence (containsKey)
        HashMap<String, String> configMap = new HashMap<>();
        configMap.put("db_url", "localhost:3306");
        configMap.put("Mac-Address", null);
        configMap.putIfAbsent("timeout", "60"); // Key does not exist, so the value is inserted
        configMap.putIfAbsent("db_url", "localhost:3306");  // Key exists, so the value is not inserted
        configMap.putIfAbsent("db_url", "localhost:8080");  // if key having already a values it will not update.
        configMap.putIfAbsent("Mac-Address", "CC:46:D6"); // if key having null values it updates the key with its value
        System.out.println(configMap);

        //Updating an Existing Value (put or replace)
        HashMap<String, String> userProfile = new HashMap<>();
        userProfile.put("username", "dev_user");
        userProfile.put("status", "INACTIVE");
        userProfile.put("status", "ACTIVE");
        System.out.println(userProfile);

        System.out.println();
        //Iterating over a Map (entrySet or keySet)

        HashMap<Integer, String> httpCodes = new HashMap<>();
        httpCodes.put(200, "Ok");
        httpCodes.put(404, "Not Found");
        httpCodes.put(500, "Interval Server Error");

        for(Map.Entry<Integer,String> entry : httpCodes.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // using lambda expression
        System.out.println();
        System.out.println("for each with lambda expression over hashmap");
        httpCodes.forEach((key, value) ->  {
            System.out.println(key + " " + value);
        });


        //5 Best Ways to Iterate Over HashMap in Java

        // 1. Iterate through HashMap EntrySet using Iterator
        System.out.println("\n1.Iterate through HashMap EntrySet using Iterator");
        Map<Integer, String> courseMap = new HashMap<>();
        courseMap.put(101, "Java");
        courseMap.put(102, "Python");
        courseMap.put(103, "C++");
        courseMap.put(104, "JavaScript");

        Iterator<Entry<Integer,String>> iter = courseMap.entrySet().iterator();
        while(iter.hasNext()) {
            Entry<Integer, String> entry = iter.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // 2. Iterate through HashMap KeySet using Iterator
        System.out.println("\n2.Iterate through HashMap KeySet using Iterator");
        Iterator<Integer> keySetIterator = courseMap.keySet().iterator();
        while(keySetIterator.hasNext()) {
            Integer key = keySetIterator.next();
            System.out.println(courseMap.get(key));
        }

        // 3. Iterate HashMap using For-each loop
        System.out.println("\n3.Iterate HashMap using For-each loop");
        for(Map.Entry<Integer, String> entry : courseMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //4. Iterate through a HashMap using Lambda Expression
        System.out.println("\n4.Iterate through a HashMap using Lambda Expression");
        courseMap.forEach((key,value) -> {
            System.out.println(key + " " +value);
        });

        // 5. Loop through HashMap using Stream API
        System.out.println("\n5.Loop through HashMap using Stream API");
        courseMap.entrySet().stream().forEach((entry) -> {
            System.out.println(entry.getKey() + " " + entry.getValue());
        });


        // Methods of Map.Entry Interface
        // 1. equals(Object o)
        //   equals(Object o) checks whether the current map entry is equal to the specified object.
        System.out.println();
        System.out.println("equals(Object o)::");
        Map<String,Integer> map1= new HashMap<>();
        map1.put("Apple", 10);
        map1.put("Banana", 20);
        Map.Entry<String, Integer> e1 = map1.entrySet().iterator().next();
        Map.Entry<String, Integer> e2 = map1.entrySet().iterator().next();
        System.out.println(e1.equals(e2));

        // 2. getKey()
        // getKey() returns the key associated with the current map entry.
        System.out.println();
        System.out.println("getKey::");
        for(Map.Entry<String, Integer> e : map1.entrySet()) {
            System.out.println(e.getKey());
        }

        // 3. getValue()
        // getValue() returns the value associated with the current map entry.
        System.out.println();
        System.out.println("getValue::");
        for(Map.Entry<String, Integer> entry : map1.entrySet()) {
            System.out.println(entry.getValue());
        }

        // 4. hashCode()
        // hashCode() returns the hash code of the current map entry based on its key and value.
        System.out.println();
        System.out.println("hashCode::");
        for(Map.Entry<String, Integer> entry1 : map1.entrySet()) {
            System.err.println(entry1.hashCode() + " ");
        }


        // 5. setValue(V value)
        // setValue(V value) updates the value associated with the current map entry.
        System.out.println();
        System.out.println("setValue::");
        Map<String,Integer> map2 = new HashMap<>();
        map2.put("Java", 1000);
        map2.put("Python", 2000);
        map2.put("C++", 3000);

        for(Map.Entry<String, Integer> entry2 : map2.entrySet()) {
            entry2.setValue(entry2.getValue() + 1000);
        }
        System.out.println(map2);

    }

}
