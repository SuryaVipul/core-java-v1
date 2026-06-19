package InterviewQuestions;

// Interview Question -> Default Methods(Java 8 feature) in an interface.

interface Payment {
    void pay();
    default void refund() {
        System.out.println("Default Method flow executed");
    }

    default boolean isValidPayment() {
        return true;
    }
}

class CreditCard implements Payment {
    @Override
    public void pay() {
        System.out.println("Payment using CC");
    }

    @Override
    public void refund() {
        System.out.println("CC refund flow executed");
    }
}

class Upi implements Payment {

    @Override
    public void pay() {
        System.out.println("Payment using UPI");
    }
}

public class LaunchQuestion19 {
    public static void main(String[] args) {
       CreditCard card = new CreditCard();
       card.refund();

       Upi upi = new Upi();
       upi.refund();
    }
}
