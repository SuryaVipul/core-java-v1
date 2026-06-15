package InterviewQuestions;

import java.util.ArrayList;
import java.util.List;

class IterateList {
    public void iterateList(List<Integer> list) {
        // for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();

        // while loop
        int j = 0;
        while (j < list.size()){
            System.out.println(list.get(j));
            j++;
        }

        System.out.println();

        // advanced for loop
        for (int item : list){
            System.out.println(item);
        }
    }
}

public class LaunchQuestion7 {
    public static void main(String[] args) {
        IterateList it = new IterateList();
        List<Integer> list1= new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);

        it.iterateList(list1);
    }
}
