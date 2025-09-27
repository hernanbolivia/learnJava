package day19.exercise4;

public class PasswordAuthenticationImpl implements Authentication{

    private String user;
    private String password;


    public PasswordAuthenticationImpl(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    @Override
    public boolean authenticate(String credentials) {
        return this.password.equals(credentials);
    }

    @Override
    public String getAuthenticationDetails() {
        return "Password authentication for user: " + this.user;
    }
}
