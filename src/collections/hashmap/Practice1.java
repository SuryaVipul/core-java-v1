package collections.hashmap;


import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Practice1 {

    public static void main(String[] args) {

        // HashMap entrySet()

        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(101, "Welcome");
        hm.put(102, "to");
        hm.put(103, "Java");
        hm.put(104, "Collections");
        hm.put(105, "Java");

        // Displaying the HashMap
        System.out.println("Initial Mappings: " + hm);

        // Using entrySet() to get the set view
        System.out.println("The set is: " + hm.entrySet());

        System.out.println();

        // Using Advanced for loop
        Map<Integer, String> map = new HashMap<>();
        map.put(101, "Surya");
        map.put(102, "Jaya");
        map.put(103, "Vipul");
        map.put(104, "Riyaz");

        Set<Map.Entry<Integer, String>> entries =map.entrySet();
        for(Map.Entry<Integer, String> entry : entries) {
            System.out.println("Key => " + entry.getKey() + " Value => "+entry.getValue());
        }

        System.out.println();

        // Using while loop with iterator
        Iterator<Map.Entry<Integer, String>> itr1 = map.entrySet().iterator();
        while(itr1.hasNext()) {
            Map.Entry<Integer, String> entry1 = itr1.next();
            System.out.println("Key => " + entry1.getKey() + " Value => "+entry1.getValue());
        }

        System.out.println();

        // HashMap getOrDefault() Method

        // the working of
        // getOrDefault() with an existing key

        Map<String,Integer> hm1 = new HashMap<>();
        hm1.put("Surya1", 1);
        hm1.put("Surya2", 2);

        // key "Surya1" exist so it's associated value is returned
        int a = hm1.getOrDefault("Surya1", 0);
        System.out.println("Value of 'Surya1':  "+a);


        String input = "Surya";
        char[] chars = input.toCharArray();
        //String[] chars = input.split("");
        //System.out.println(Arrays.toString(chars));
    }

}
