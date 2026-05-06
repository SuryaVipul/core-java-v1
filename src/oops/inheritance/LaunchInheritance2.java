package oops.inheritance;

class Vehicle{
    private String brand;
    private int speed;

    public Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }
    public void displayVehicleDetails(){
        System.out.println("Brand :- "+this.getBrand());
        System.out.println("Speed -: "+this.getSpeed());
    }
}

class Car extends Vehicle{
    private String fuelType;

    public Car(String brand, int speed, String fuelType) {
        super(brand, speed);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void displayCarDetails(){
        super.displayVehicleDetails();
        System.out.println("Fuel Type -: "+this.getFuelType());
    }
}

public class LaunchInheritance2 {
    public static void main(String[] args) {
    Car car1 = new Car("Toyota",180,"Petrol");
    Car car2 = new Car("Tesla",250,"Electric");
    car1.displayCarDetails();
    System.out.println("----------------------");
    car2.displayCarDetails();
    }
}
