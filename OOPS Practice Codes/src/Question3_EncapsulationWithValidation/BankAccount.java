package Question3_EncapsulationWithValidation;

public class BankAccount {
    private String accountHolder;
    private double balance;
    private String accountNumber;

    public BankAccount(String accountHolder , double balance , String accountNumber){
        this.accountHolder = accountHolder;
        setBalance(balance);
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0){
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative. Setting to 0.");
            this.balance = 0;
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void printDetails() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}


