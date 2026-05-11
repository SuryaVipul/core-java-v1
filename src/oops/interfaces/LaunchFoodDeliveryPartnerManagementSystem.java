package oops.interfaces;

interface DeliveryPartner {

    void acceptOrder(String orderName);

    void deliverOrder();

    void showPartnerType();
}

class Bike implements DeliveryPartner{
    public void acceptOrder(String orderName) {
        System.out.println("The Order " + orderName + " is Accepted");
    }

    public void deliverOrder() {
        System.out.println("Pizza delivered successfully through Bike");
    }

    public void showPartnerType() {
        System.out.println("Delivered through Bike ");
    }
}


class Bicycle implements DeliveryPartner{
    public void acceptOrder(String orderName) {
        System.out.println("The Order " + orderName + " is Accepted");
    }

    public void deliverOrder() {
        System.out.println("Milk delivered successfully through Bicycle");
    }
    public void showPartnerType() {
        System.out.println("Delivered through Bicycle ");
    }
}

class Drone implements DeliveryPartner{
    public void acceptOrder(String orderName) {
        System.out.println("The Order " + orderName + " is Accepted");
    }

    public void deliverOrder() {
        System.out.println("Batteries delivered successfully through Drone");
    }
    public void showPartnerType() {
        System.out.println("Delivered through Drone ");
    }
}


public class LaunchFoodDeliveryPartnerManagementSystem {
    public static void main(String[] args) {
        DeliveryPartner deliveryPartner;

        deliveryPartner = new Bike();
        deliveryPartner.acceptOrder("Pizza");
        deliveryPartner.showPartnerType();
        deliveryPartner.deliverOrder();

        System.out.println("*******************************************");

        deliveryPartner = new Bicycle();
        deliveryPartner.acceptOrder("Milk");
        deliveryPartner.showPartnerType();
        deliveryPartner.deliverOrder();

        System.out.println("*******************************************");

        deliveryPartner = new Drone();
        deliveryPartner.acceptOrder("Batteries");
        deliveryPartner.showPartnerType();
        deliveryPartner.deliverOrder();
    }
}
