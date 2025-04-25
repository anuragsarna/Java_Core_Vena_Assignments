public abstract class BankAccount implements Transaction {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    // Constructor chaining with this()
//    public BankAccount(String accountNumber) {
//        this(accountNumber, "Unknown");
//    }

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = 0.0;
    }

    // Abstract method
    public abstract void showAccountType();

    // Common method
    public void displayBalance() {
        System.out.println("Balance: $" + balance);
    }
}
