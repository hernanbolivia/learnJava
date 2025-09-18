package day19.exercise1;

public class PaymentProcessor {

    public void processPayment(PaymentMethod paymentMethod, double amount){
        paymentMethod.processPayment(amount);
        System.out.println("Payment details: "+paymentMethod.getPaymentDetails());

    }


}
