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
        System.out.println("Processing Paypal payment: $" + amount + " for " + this.email);

    }

    @Override
    public String getPaymentDetails() {
        return "Paypal - Email: " + this.email;
    }
}
