package oops.interfaces;

interface Notification {
    void sendNotification(String message);
}

class EmailNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sending Email: "+ message);
    }
}
class SMSNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sending SMS: "+ message);
    }
}
class PushNotification implements Notification {
    public void sendNotification(String message) {
        System.out.println("Sending Push Notification: "+ message);
    }
}

public class LaunchInterface3 {
    public static void main(String[] args) {
        Notification notification;

        notification = new EmailNotification();
        notification.sendNotification("Congratulations, You have been selected to our ABC company");

        notification = new SMSNotification();
        notification.sendNotification("Please find your otp for your ABC order ");

        notification = new PushNotification();
        notification.sendNotification("Keep working hard you will success one day");
    }
}
