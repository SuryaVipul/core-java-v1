package oops.projects.SmartOrderManagementSystem;

abstract class Product {
  private int productId;
  private String productName;
  private double originalPrice;

    public Product(int productId, String productName, double originalPrice) {
        this.productId = productId;
        this.productName = productName;
        this.originalPrice = originalPrice;
    }

    public int getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public double getOriginalPrice() {
        return originalPrice;
    }

    public abstract double calculateFinalPrice();
    public void displayProductDetails() {
        System.out.println("Product id :- " + this.productId);
        System.out.println("Product Name :- " + this.productName);
        System.out.println("Original Price :- " + getOriginalPrice());
        System.out.println("Final Price After Discount :- " + calculateFinalPrice());
    }
}

class ElectronicsProduct extends Product {
    public ElectronicsProduct(int productId, String productName, double originalPrice) {
        super(productId, productName, originalPrice);
    }
    @Override
    public double calculateFinalPrice() {
        double discount = (getOriginalPrice() * 10) / 100;
        return getOriginalPrice() - discount;
    }
}

class ClothingProduct extends Product{
    public ClothingProduct(int productId, String productName, double originalPrice) {
        super(productId, productName, originalPrice);
    }
        @Override
        public double calculateFinalPrice() {
            double discount = (getOriginalPrice() * 20) / 100;
            return getOriginalPrice() - discount;
        }
    }

class GroceryProduct extends Product{
    public GroceryProduct(int productId, String productName, double originalPrice) {
        super(productId, productName, originalPrice);
    }
    @Override
    public double calculateFinalPrice() {
        double discount = (getOriginalPrice() * 5) / 100;
        return getOriginalPrice() - discount;

    }
}

abstract class Payment{
    public abstract void processPayment(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs. " + amount + " through Credit Card");
    }
}

class UPIPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs. " + amount + " through UPI");
    }
}

class WalletPayment extends Payment {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing payment of Rs. " + amount + " through Wallet");
    }
}

class Customer {
    private int customerId;
    private String customerName;

    public Customer(int customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }
    public void placeOrder(Product product, Payment payment) {
        System.out.println("Customer Name :- " + customerName);
        product.displayProductDetails();

        double finalAmount = product.calculateFinalPrice();

        payment.processPayment(finalAmount);

        System.out.println("Order Placed Successfully");
        System.out.println("====================================");
    }
}
public class LaunchSmartOrderManagementSystem {
    public static void main(String[] args) {
        Customer customer1 = new Customer(1, "Surya");

        Product product1 = new ElectronicsProduct(101, "Macbook Air M1", 100000);

        Payment payment1 = new CreditCardPayment();

        customer1.placeOrder(product1, payment1);

        Product product2 = new ClothingProduct(102, "T-Shirt", 5000);

        Payment payment2 = new UPIPayment();

        customer1.placeOrder(product2, payment2);

        Product product3 = new GroceryProduct(103, "Rice Bag", 2000);

        Payment payment3 = new WalletPayment();

        customer1.placeOrder(product3, payment3);
    }
}
