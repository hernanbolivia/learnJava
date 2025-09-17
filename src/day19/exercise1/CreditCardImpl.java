package day19.exercise1;

public class CreditCardImpl implements PaymentMethod {

    private String cardNumber;
    private String titularName;


    public CreditCardImpl(String cardNumber, String titularName) {
        this.cardNumber = cardNumber;
        this.titularName = titularName;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getTitularName() {
        return titularName;
    }

    public void setTitularName(String titularName) {
        this.titularName = titularName;
    }


    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment: $" + amount + "For "+ this.titularName);

    }

    @Override
    public String getPaymentDetails() {
        return "Credit card - Titular: " + this.titularName + " - Card Number: " + this.cardNumber;
    }
}
