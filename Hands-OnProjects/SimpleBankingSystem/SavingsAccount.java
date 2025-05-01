public class SavingsAccount extends BankAccount {

    public SavingsAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into savings account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from savings account.");
        } else {
            System.out.println("Insufficient funds in savings account.");
        }
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Savings Account");
    }
}
