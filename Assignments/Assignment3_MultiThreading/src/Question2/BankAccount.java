package Question2;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private List<String> transactionlog = new ArrayList<>();
    private final ReentrantLock lock = new ReentrantLock();
    private int accountId;

    public BankAccount(int accountId, double initilbalance) {
        this.accountId = accountId;
        this.balance = initilbalance;
    }

    public void deposit(double amount, String threadname) {
        lock.lock();
        try {
            balance += amount;
            logTransaction(threadname + " deposited $" + amount + " | New balance: $" + balance);
        } catch (Exception e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock();
        }
    }

    public boolean withdraw(double amount, String threadName) {
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                logTransaction(threadName + " withdrew $" + amount + " | New balance: $" + balance);
                return true;
            } else {
                logTransaction(threadName + " failed to withdraw $" + amount + " | Insufficient funds: $" + balance);
                return false;
            }
        } finally {
            lock.unlock();
        }
    }

    private void logTransaction(String entry) {
        transactionlog.add(entry);
    }

    public double getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }

    public List<String> getTransactionLog() {
        return transactionlog;
    }

    public int getAccountId() {
        return accountId;
    }
}
