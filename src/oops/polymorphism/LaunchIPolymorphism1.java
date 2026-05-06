package oops.polymorphism;

abstract  class Aeroplane {

   // abstract int age; // illegal. variables cannot be abstract
    public abstract void takeOff();
    public abstract void fly();

    public void landing() {
        System.out.println("Aeroplane is Landing");
    }
}

class CargoPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("CargoPlane requires longer runway to takeOff");
    }
    public void fly(){
        System.out.println("CargoPlane flies at lower height");
    }
}

class FighterPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("FighterPlane requires shorter runway to takeOff");
    }
    public void fly(){
        System.out.println("FighterPlane flies at higher height");
    }
}

class CommercialPlane extends Aeroplane {
    public void takeOff() {
        System.out.println("CommercialPlane requires mid sie runway to takeOff");
    }
    public void fly(){
        System.out.println("CommercialPlane flies at medium height");
    }
}
class Airport {
    public void permit(Aeroplane aero) {

      //  1 to Many --> Polymorphism
        aero.takeOff();
        aero.fly();
    }
}

public class LaunchIPolymorphism1 {
    public static void main(String[] args) {
    CargoPlane cp = new CargoPlane();
    FighterPlane fp = new FighterPlane();
    CommercialPlane p = new CommercialPlane();

    Airport a = new Airport();
    a.permit(cp);
    a.permit(fp);
    a.permit(p);

//    Aeroplane aero;
//    aero = cp;
//
//    aero.takeOff();
//    aero.fly();
//
//    System.out.println("**************************************************");
//
//    aero = fp;
//
//    aero.takeOff();
//    aero.fly();

    }
}
