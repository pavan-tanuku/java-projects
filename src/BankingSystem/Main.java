package BankingSystem;

public class Main {
    public static void main(String[] args) {
        // creating array of BankAccount type
        BankAccount[] accounts = new BankAccount[2];

        accounts[0] = new SavingsAccount(
                "123456789100",
                "Alice",
                "0987654321",
                1_000.0
        );
        accounts[1] = new CurrentAccount(
                "142638927258",
                "Bod",
                "9563182036",
                1_00_000.00,
                -10_000
        );

        for(BankAccount account: accounts) {
            System.out.println(account);
            System.out.println();
            account.deposit(500.00);
            account.withDraw(1_000);
            System.out.println();

            if(account instanceof CurrentAccount) {
                System.out.println("withdrawing to check overdraft of current account");
                account.withDraw(1_09_501);
            }
        }
    }
}
