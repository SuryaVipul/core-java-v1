package InterviewQuestions;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class IterateHashMap {
    public void iterateHashMap(Map<String, String> map) {
        // Using advanced for loop
            for (Map.Entry<String,String> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }

        System.out.println();
            // Using while loop with iterator
        Iterator<Map.Entry<String,String>> iterator =
                map.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String,String> entry = iterator.next();
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
    }
}

public class LaunchQuestion4 {
    public static void main(String[] args) {

        IterateHashMap it = new IterateHashMap();

        Map<String, String> map = new HashMap<>();

        map.put("101", "Surya");
        map.put("102", "Rahul");
        map.put("103", "Ankit");
        map.put("104", "Priya");
        map.put("105", "Neha");

        it.iterateHashMap(map);

    }
}
