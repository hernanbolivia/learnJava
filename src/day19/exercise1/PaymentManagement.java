package day19.exercise1;

public class PaymentManagement {
    public static void main(String[] args) {

        PaymentMethod creditCard = new CreditCardImpl(
                "123-2555-8888-222",
                "Tedd Smith");

        PaymentMethod payPal = new PaypalImpl(
                "tedd.smith@ejemplo.com",
                "4656");

        PaymentMethod crypto = new CryptoCurrencyImpl(
                "ASDASDASD262323");

        //This class processes all the payments.
        PaymentProcessor processor = new PaymentProcessor();

        System.out.println("\n====== Process payment======\n");
        processor.processPayment(creditCard,100);
        System.out.println();

        processor.processPayment(payPal,200);
        System.out.println();

        processor.processPayment(crypto,300);
        System.out.println();



    }
}
