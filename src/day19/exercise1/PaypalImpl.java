package day19.exercise1;

public class PaypalImpl implements PaymentMethod {

    private String email;
    private String password;


    public PaypalImpl(String email, String password) {
        this.email = email;
        this.password = password;
    }



    @Override
    public void processPayment(double amount) {

    }

    @Override
    public String getPaymentDetails() {
        return "";
    }
}
