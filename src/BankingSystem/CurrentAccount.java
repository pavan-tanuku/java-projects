package BankingSystem;

public class CurrentAccount extends BankAccount{

    private int overDraft;
    private static final String accountType;
    static {
        accountType = "Current Account";
    }

    public CurrentAccount(String accountNumber, String accountHolder, String phoneNumber, double balance, int overDraft) {
        super(accountNumber, accountHolder, phoneNumber, balance);
        this.overDraft = overDraft;
    }

    @Override
    public void deposit(double amount) {
        double bal = getBalance();
        if(amount > 0) {
            System.out.println("Deposit(Current Account) amount Rs: " + amount);
            bal += amount;
            setBalance(bal);
            System.out.println("The current balance after deposit Rs: " + getBalance());
        } else {
            System.err.println("Please ENTER VALID AMOUNT");
        }
    }

    @Override
    public double withDraw(double amount) {
        double bal = getBalance();
        if(amount > 0 && underOverDraft(bal, amount, overDraft)) {
            System.out.println("Withdraw(Current Account) amount: " + amount);
            bal -= amount;
            setBalance(bal);
            System.out.println("The current balance after with-draw Rs: " + getBalance());
        } else if (amount <= 0){
            System.err.println("Please ENTER VALID AMOUNT");
        } else {
            System.err.println("INSUFFICIENT FUNDS");
        }
        return getBalance();
    }

    public boolean underOverDraft(double balance, double amount, int overDraft) {
        return balance - amount >= overDraft;
    }

    // Getters and Setters
    public int getOverDraft() {
        return overDraft;
    }

    public void setOverDraft(int overDraft) {
        this.overDraft = overDraft;
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
