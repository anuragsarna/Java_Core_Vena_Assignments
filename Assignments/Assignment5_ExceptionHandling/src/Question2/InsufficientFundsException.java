package Question2;

public class InsufficientFundsException extends BankingException {
    // Constructor to create an exception with a custom message
    public InsufficientFundsException(String message) {
        super(message);
    }
}

