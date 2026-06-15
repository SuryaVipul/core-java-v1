package InterviewQuestions;

import java.util.HashSet;
import java.util.Objects;


// Interview Question -> use case and internal working of equals() and hashcode() method.

class Employee {
    int id;
    String name;

    @Override
    public boolean equals(Object obj) {
        Employee e = (Employee) obj;
        if (e.id == this.id){
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}


public class LaunchQuestion9 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.id = 1;
        e1.name = "Surya";

        Employee e2 = new Employee();
        e2.id = 1;
        e2.name = "Vipul";

        System.out.println(e1.equals(e2));

//        String s1 = new String("Jaya");
//        String s2 = new String("Jaya");
//
//        System.out.println(s1.equals(s2));

        HashSet<Employee> set = new HashSet<>();
        set.add(e1);
        set.add(e2);

        System.out.println(set.size());

    }
}
