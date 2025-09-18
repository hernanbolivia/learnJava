package day19.exercise1;

public class CryptoCurrencyImpl implements PaymentMethod {

    private String walletAddress;


    public CryptoCurrencyImpl(String walletAddress) {
        this.walletAddress = walletAddress;
    }


    public String getWalletAddress() {
        return walletAddress;
    }

    public void setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
    }



    @Override
    public void processPayment(double amount) {
        System.out.println("Processing CryptoCurrency payment: $" + amount + " To Wallet Address " + this.walletAddress);

    }

    @Override
    public String getPaymentDetails() {
        return "CryptoCurrency Wallet Address: " + this.walletAddress;
    }
}
