package Question2;

public class InvalidAccountException extends BankingException {
    // Constructor to create an exception with a custom message
    public InvalidAccountException(String message) {
        super(message);
    }
}
