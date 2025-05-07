import java.util.Arrays;
import java.util.List;

public class Question31 {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
                new Transaction("DEBIT",150),
                new Transaction("CREDIT",200),
                new Transaction("DEBIT",300),
                new Transaction("DEBIT",50)
        );

        double totalDebit = transactions.stream()
                .filter(tx -> tx.getType().equalsIgnoreCase("DEBIT"))
                .mapToDouble(Transaction::getAmount)         //more efficient for math operations
                .sum();

        System.out.println("Total DEBIT Amount : " + totalDebit);
    }
}

class Transaction{
    private String type;
    private double amount;

    public Transaction(String type , double amount){
        this.type = type;
        this.amount = amount;
    }

    public double getAmount() {return amount; }
    public String getType() { return type; }
}
