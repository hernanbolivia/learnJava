package day19.exercise3;

public class PushNotificationImpl implements Notification {

    private String deviceToken;

    public PushNotificationImpl(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    public String getDeviceToken() {
        return deviceToken;
    }

    public void setDeviceToken(String deviceToken) {
        this.deviceToken = deviceToken;
    }

    @Override
    public void send(String message) {
        System.out.printf("Sending push notification to %s: %s%n", this.deviceToken, message);

    }

    @Override
    public String getNotificationDetails() {
        return String.format("Notification Type: Push%nDevice Token: %s", this.deviceToken);
    }
}
