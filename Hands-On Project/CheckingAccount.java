public class CheckingAccount extends BankAccount {

//    private double overdraftLimit;

    public CheckingAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
//        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited $" + amount + " into checking account.");
    }

    @Override
    public void withdraw(double amount) {
        if (balance  >= amount) {
            balance -= amount;
            System.out.println("Withdrew $" + amount + " from checking account.");
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public void showAccountType() {
        System.out.println("Account Type: Checking Account");
    }
}
