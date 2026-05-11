package oops.interfaces;

interface  Telusko {
    default void course () {
        System.out.println("telusko Learning");
        ai();
        sd();
    }

    static void ai() {
        System.out.println("ai method of an interface");
    }
    private void sd(){
        System.out.println("system design course");

    }
}

class AI implements Telusko {
//    public void course () {
//        System.out.println("telusko Learning");
//    }
}

public class LaunchInterface2 {
    public static void main(String[] args) {
        Telusko telusko = new AI();
        telusko.course();
      //  telusko.ai();
        Telusko.ai();
    }
}
