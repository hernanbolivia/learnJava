package day19.exercise3;

public class EmailNotificationIml implements Notification{

    private String emailAddress;

    public EmailNotificationIml(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }


    @Override
    public void send(String message) {
        System.out.printf("Sending email to %s with message: \"%s\"%n", this.emailAddress, message);

    }

    @Override
    public String getNotificationDetails() {
        return String.format("Notification Type: Email%nRecipient: %s", this.emailAddress);
    }
}
