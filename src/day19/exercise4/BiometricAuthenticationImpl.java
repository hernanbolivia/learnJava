package day19.exercise4;

public class BiometricAuthenticationImpl implements Authentication{

    private String fingerprintData;

    public BiometricAuthenticationImpl(String fingerprintData) {
        this.fingerprintData = fingerprintData;
    }

    public String getFingerprintData() {
        return fingerprintData;
    }

    public void setFingerprintData(String fingerprintData) {
        this.fingerprintData = fingerprintData;
    }


    @Override
    public boolean authenticate(String credentials) {
        return this.fingerprintData.equals(credentials);
    }

    @Override
    public String getAuthenticationDetails() {
        return "Biometric authentication using fingerprint";
    }
}
