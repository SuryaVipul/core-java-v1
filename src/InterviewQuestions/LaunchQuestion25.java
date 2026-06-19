package InterviewQuestions;

// Interview Question -> Java 8 Optional Class - isPresent(), ifPresent(), orElse(), ofNullable()

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

class User1 {
    private int id;
    private String name;

    public User1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class UserService {
    public Optional<User1> getUserId(int id) {
        List<User1> users = Arrays.asList(new User1(1,"Surya"),new User1(2,"Vipul"),new User1(3,"Jaya"));
         for (User1 user : users) {
             if (user.getId() == id){
                 return Optional.of(user);
             }
         }
         return Optional.empty(); // user not found
    }
}

public class LaunchQuestion25 {
    public static void main(String[] args) {
        UserService userService = new UserService();
        Optional<User1> optionalUser = userService.getUserId(2);

        if (optionalUser.isPresent()) {
            User1 user = optionalUser.get();
            System.out.println("Name: " + user.getName() + " Id: "+user.getId());
        }

        // optional using Consumer Interface
//        Consumer<User1> c1 = (user) -> {
//            System.out.println("Name: " + user.getName() + " Id: "+user.getId());
//        };
//        c1.accept(optionalUser.get());


        // optional using lambda
        // optional -> ifPresent()
        optionalUser.ifPresent(user -> System.out.println("Name: " + user.getName() + " Id: "+user.getId()));

        // optional -> orElse()
         User1 user = optionalUser.orElse(new User1(-1,"Default User"));
         System.out.println("Name: " + user.getName() + " Id: "+user.getId());

         // Supplier
//        Supplier<User1> s1 = () -> new User1(-1,"Default User");
//        s1.get();

        // optional -> orElseGet()
        User1 user1 = optionalUser.orElseGet(() -> new User1(-1,"Default User"));
        System.out.println("Name: " + user1.getName() + " Id: "+user1.getId());

        // optional -> orElseThrow()
        User1 user2 = optionalUser.orElseThrow(() -> new RuntimeException("User not found"));
        System.out.println("Name: " + user1.getName() + " Id: "+user1.getId());


//        if (user != null) {
//            System.out.println("Name: " + user.getName() + " Id: "+user.getId());
//        }

    }
}
