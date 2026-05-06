package oops.overriding;

class Animal {
    public  void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal{
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class LaunchOverriding1 {
    public static void main(String[] args) {
        Animal a = new Animal();
        Dog d = new Dog();
        a.sound();
        d.sound();
    }
}
