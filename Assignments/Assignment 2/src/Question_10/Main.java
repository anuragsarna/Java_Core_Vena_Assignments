package Question_10;

import java.util.Date;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankTransactionLog bankLog = new BankTransactionLog();

        bankLog.addTransaction("ACC123", new Transaction(new Date(), 200.0, "Deposit"));
        Thread.sleep(3000);
        bankLog.addTransaction("ACC123", new Transaction(new Date(), -50.0, "Withdrawal"));
        Thread.sleep(3000);
        bankLog.addTransaction("ACC123", new Transaction(new Date(), 100.0, "Deposit"));

        bankLog.generateStatement("ACC123");
    }
}
