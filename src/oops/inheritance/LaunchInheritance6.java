package oops.inheritance;


class Animal{
    public void eat(int age){
        System.out.println("Animal is eating");
    }
    public int age(){
        return 8;
    }
}

class Tiger extends Animal{
    public void eat() {
        System.out.println("Tiger hunts and eat");
    }
    //public void age() // invalid i.e. the return type of overriden method cannot be changed.
        public int age()
        {
            return 10;
        }
}

public class LaunchInheritance6 {
    public static void main(String[] args) {
        Tiger t = new Tiger();
        t.eat();
    }
}
