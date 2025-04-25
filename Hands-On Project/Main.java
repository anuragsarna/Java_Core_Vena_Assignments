public class Main {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount("SA123", "Alice");
        BankAccount checking = new CheckingAccount("CA456", "Bob");

        savings.showAccountType();
        savings.deposit(1000);
        savings.withdraw(200);
        savings.displayBalance();

        System.out.println();

        checking.showAccountType();
        checking.deposit(500);
        checking.withdraw(900);
        checking.displayBalance();
    }
}
