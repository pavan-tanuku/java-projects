package BankingSystem;

// Zero Saving Account

public class SavingsAccount extends BankAccount{

    private static final String accountType;
    static {
        accountType = "Savings Account";
    }
    
    public SavingsAccount(String accountNumber, String accountHolder, String phoneNumber, double balance) {
        super(accountNumber, accountHolder, phoneNumber, balance);
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0) {
            System.out.println("Deposit(Saving Account) amount Rs: " + amount);
            double bal = getBalance();
            bal += amount;
            setBalance(bal);
            System.out.println("The current balance after deposit Rs: " + getBalance());
        } else {
            System.err.println("Please ENTER VALID AMOUNT");
        }
    }

    @Override
    public double withDraw(double amount) {
        if(amount > 0 && getBalance() >= amount) {
            System.out.println("Withdraw(Saving Account) amount Rs: " + amount);
            double bal = getBalance();
            bal -= amount;
            setBalance(bal);
            System.out.println("The current balance after with-draw Rs: " + getBalance());
        } else if (amount <= 0) {
            System.err.println("Please ENTER VALID AMOUNT");
        } else {
            System.err.println("Insufficient Funds");
        }
        return getBalance();
    }

    @Override
    public String toString() {
        return "Account Type: " + accountType + "\n" +
                "Account Holder: " + getAccountHolder() + "\n" +
                "Account Number: " + getAccountNumber() + "\n" +
                "Balance: Rs " + getBalance() + "\n" +
                "Phone: " + getPhoneNumber();
    }
}
