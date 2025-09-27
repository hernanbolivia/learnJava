package day19.exercise3;

public class Main {
    public static void main(String[] args) {

        Notification  email = new EmailNotificationIml("hernan.bolivia.1991@.com");
        Notification  sms = new SmsNotificationImpl("+51 965-275-114");
        Notification push = new PushNotificationImpl("device-275-114");

        NotificationService service = new NotificationService();

        service.sendNotification(email, "Hello Hernán, this is your email notification");
        service.sendNotification(sms, "Hello Hernán, this is your SMS notification");
        service.sendNotification(push, "Hello Hernán, this is your push notification");



    }
}
