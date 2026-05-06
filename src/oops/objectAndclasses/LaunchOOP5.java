package oops.objectAndclasses;

class Product {
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public void displayProductDetails(){
        System.out.println(id + " " + name + " " + price);
    }
}

class Order {
    int orderId;
    Product product;
    int quantity;

    public Order(int orderId, Product product, int quantity) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
    }

    public int calculateTotalPrice() {
        int total = 0;
        if (quantity <= 0) {
            System.out.println("Invalid Quantity");
        }
        else {
             total = (int) product.price * quantity;
        }
        return total;
    }
    public void displayOrderDetails() {
        System.out.println("Order Id -: "+this.orderId);
        System.out.println("Product -: "+product.name);
        System.out.println("Price -: "+product.price);
        System.out.println("Quantity -: "+this.quantity);
        System.out.println("Total -: "+calculateTotalPrice());
    }
}
public class LaunchOOP5 {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000);
        Order o1 = new Order(1, p1, 6);
        o1.displayOrderDetails();
    }
}
