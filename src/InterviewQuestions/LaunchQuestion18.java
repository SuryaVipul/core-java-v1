package InterviewQuestions;

// Interview Question -> Immutable Class in Java

final class Player {
    private final String name;
    private final int age;
    private final String team;

    public Player(String name, int age, String team) {
        this.name = name;
        this.age = age;
        this.team = team;
    }

//    public void switchTeam(String newTeam, boolean isPlayerConsent) {
//        if (isPlayerConsent){
//            this.team = newTeam;
//        }
//        else {
//            System.out.println("Switch is not allowed");
//        }
//    }

    public void print() {
        System.out.println("Name: "+ this.name + " Age: "+this.age + " Team: "+this.team);
    }

}

/*
class mutablePlayer extends Player {
    int noOfMatches;
    public mutablePlayer(String name, int age, String team) {
        super(name, age, team);
    }
}
*/

public class LaunchQuestion18 {
    public static void main(String[] args) {
    Player p1 = new Player("Rohit Sharma", 38, "MI");
    p1.print();

    Player p2 = new Player("Virat Kohli", 37, "RCB");

    p2.print();

  //  p2.switchTeam("SRH",true);

    p2.print();


    }
}
