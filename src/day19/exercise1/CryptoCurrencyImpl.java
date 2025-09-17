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

    }

    @Override
    public String getPaymentDetails() {
        return "";
    }
}
