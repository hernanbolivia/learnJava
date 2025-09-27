package day19.exercise3;

public class NotificationService {

    public void sendNotification(Notification notification, String message){

        System.out.println("\n------------------------------------------------\n");
        System.out.printf("Preparing to send notification with message: \"%s\"%n", message);
        notification.send(message);
        System.out.printf("Notification details:%n%s%n", notification.getNotificationDetails());



    }

}
