package Question_10;

import java.util.Date;

class Transaction {
    Date timestamp;
    double amount;
    String description;

    public Transaction(Date timestamp, double amount, String description) {
        this.timestamp = timestamp;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public String toString() {
        return timestamp + " | " + amount + " | " + description;
    }
}
