package paymentSystem;
import java.time.LocalDate;

public class CreditCardPayment implements PaymentMethod, SecurePayment {
    private final String cardHolderName;
    private final String cardNumber;
    private final byte expiryMonth;
    private final byte expiryYear;
    private final String cvv;
    private double balance;
//    Constructor
    public CreditCardPayment(String cardHolderName,
                             String cardNumber,
                             byte expiryMonth,
                             byte expiryYear,
                             String cvv,
                             double balance) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.cvv = cvv;
        this.balance = balance;
    }

    @Override
    public boolean authenticate() {
        if(isCardValid() && isExpiryValid()){
            System.out.println("The account has been authenticated");
            return true;
        }
        return false;
    }

    @Override
    public boolean pay(double amount) {
        if(authenticate()) {
            if (amount <= 0) {
                return false;
            }
            else if (amount > balance) {
                return false;
            }
            else {
                balance -= amount;
                return true;
            }
        } else {
            System.err.println("The card authentication has been failed.");
            return false;
        }
    }
    @Override
    public boolean refund(double amount) {
        if(amount <= 0) {
            return false;
        }
        balance += amount;
        return true;
    }
    @Override
    public String getPaymentDetails() {
        return "The Account holder: " + getCardHolderName() +
                "Paid to: " + "I don't know" +
                "Amount paid: " + "I don't know" +
                "Payment type: " + "CreditCard" +
                "Time: " + "payment time" +
                "Reference id: " + "I don't know";
    }

    public boolean isCardValid() {
        return cardNumber != null && (cardNumber.length() == 12);
    }
//      currently I wrote the  basic logic for expiry validation.
//      Future Improvement: validating 2 digit and 4 digits.
    public boolean isExpiryValid() {
        LocalDate today = LocalDate.now();

        int currentMonth = LocalDate.now().getMonthValue();
        int currentYear = LocalDate.now().getYear();
        int currentDay = LocalDate.now().getDayOfMonth();
        int daysInMonth = today.lengthOfMonth();

//        The card works till TODAY.
        if(currentYear < expiryYear) return true;
        else return (this.expiryYear == currentYear && this.expiryMonth >= currentMonth && currentDay <= daysInMonth);
    }

    public String getCardHolderName() {
        return cardHolderName;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public byte getExpiryMonth() {
        return expiryMonth;
    }

    public byte getExpiryYear() {
        return expiryYear;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
