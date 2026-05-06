package oops.polymorphism;

class Payment {
    public void processPayment(){
        System.out.println("Processing generic payment");
    }
}

class CreditCardPayment extends Payment{
    public void processPayment(){
        System.out.println("Processing payment through Credit Card");
    }
}

class UPIPayment extends Payment{
    public void processPayment(){
        System.out.println("Processing payment through UPI");
    }
}

class NetBankingPayment extends Payment{
    public void processPayment(){
        System.out.println("Processing payment through Net Banking");
    }
}

class WalletPayment extends Payment {
    public void processPayment(){
        System.out.println("Processing payment through Wallet");
    }
}

class ShopProduct {
    public void shop(Payment payment) {
        payment.processPayment();
    }
}

public class LaunchIPolymorphism2 {

    public static void main(String[] args) {
        CreditCardPayment cp = new CreditCardPayment();
        UPIPayment upi = new UPIPayment();
        NetBankingPayment nb = new NetBankingPayment();
        WalletPayment wp = new WalletPayment();


        ShopProduct sp = new ShopProduct();

        sp.shop(cp);
        sp.shop(upi);
        sp.shop(nb);
        sp.shop(wp);
    }
}
