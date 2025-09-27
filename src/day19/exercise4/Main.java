package day19.exercise4;

public class Main {
    public static void main(String[] args) {

        Authentication method1 = new PasswordAuthenticationImpl("hbolivia","6456");
        Authentication method2 = new TwoFactorAuthenticationImpl("965275114", "4444");
        Authentication method3 = new BiometricAuthenticationImpl("fingerprint123");

        AuthenticationService service = new AuthenticationService();

        service.processAuthentication(method1, "6456");
        service.processAuthentication(method2, "4444");
        service.processAuthentication(method3, "fingerprint123");
    }
}
