package day19.exercise4;

public class TwoFactorAuthenticationImpl implements Authentication{

    private String phoneNumber;
    private String verificationCode;


    public TwoFactorAuthenticationImpl(String phoneNumber, String verificationCode) {
        this.phoneNumber = phoneNumber;
        this.verificationCode = verificationCode;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getVerificationCode() {
        return verificationCode;
    }

    public void setVerificationCode(String verificationCode) {
        this.verificationCode = verificationCode;
    }


    @Override
    public boolean authenticate(String credentials) {
        return this.verificationCode.equals(credentials);
    }

    @Override
    public String getAuthenticationDetails() {
        return "2FA authentication for phone number: " + this.phoneNumber;
    }
}
