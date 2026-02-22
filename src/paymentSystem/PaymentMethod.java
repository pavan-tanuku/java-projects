package paymentSystem;

public interface PaymentMethod {
    public boolean pay(double amount);
    public boolean refund(double amount);
    public String getPaymentDetails();
}
