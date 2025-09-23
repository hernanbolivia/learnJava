package day19.exercise3;

public class SmsNotificationImpl implements Notification{

    private String phoneNumber;

    public SmsNotificationImpl(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void send(String message) {
        System.out.printf("Sending SMS to %s with message: \"%s\"%n", this.phoneNumber, message);

    }

    @Override
    public String getNotificationDetails() {
        return String.format("Notification Type: SMS%nRecipient: %s", this.phoneNumber);
    }
}
