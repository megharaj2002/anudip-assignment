
interface NotificationService {
    void sendNotification(String message);
}

class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Email sent: " + message);
    }
}

class SMSNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("SMS sent: " + message);
    }
}

class PushNotification implements NotificationService {
    @Override
    public void sendNotification(String message) {
        System.out.println("Push notification sent: " + message);
    }
}

interface NotificationFactory {
    NotificationService getNotificationService(String type);
}

class NotificationFactoryImpl implements NotificationFactory {

    @Override
    public NotificationService getNotificationService(String type) {

        if (type == null) {
            return null;
        }

        switch (type.toLowerCase()) {
            case "email":
                return new EmailNotification();
            case "sms":
                return new SMSNotification();
            case "push":
                return new PushNotification();
            default:
                throw new IllegalArgumentException("Invalid notification type");
        }
    }
}

public class NotificationDemo {

    public static void main(String[] args) {

        NotificationFactory factory = new NotificationFactoryImpl();

        // Using interface references
        NotificationService emailService = factory.getNotificationService("email");
        emailService.sendNotification("Welcome via Email");

        NotificationService smsService = factory.getNotificationService("sms");
        smsService.sendNotification("OTP sent via SMS");

        NotificationService pushService = factory.getNotificationService("push");
        pushService.sendNotification("New update available");
    }
}
