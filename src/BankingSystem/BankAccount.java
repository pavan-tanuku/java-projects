package BankingSystem;

public abstract class BankAccount {
    private final String accountNumber;
    private String accountHolder;
    private String phoneNumber;
    private double balance;

    public BankAccount(String accountNumber, String accountHolder, String phoneNumber, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    // you don't need to add toString(), because it is already there in Object(in java) and
    // subclasses will get bt override.
//    public abstract String toString();
    // Deposit
    abstract void deposit(double amount);
    // Withdraw
    abstract double withDraw(double amount);
}
