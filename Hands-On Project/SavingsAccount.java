public class SavingsAccount extends BankAccount {

//    private double interestRate;

    public SavingsAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName); // Constructor chaining to superclass
//        this.interestRate = interestRate;
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
