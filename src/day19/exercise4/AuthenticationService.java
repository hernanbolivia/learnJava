package day19.exercise4;

public class AuthenticationService {

    public void processAuthentication(Authentication method, String credentials) {

        if (method.authenticate(credentials)) {
            System.out.println("Authentication successful: " + method.getAuthenticationDetails());
        }else{
            System.out.println("Authentication failed: " + method.getAuthenticationDetails());
        }
    }


}
