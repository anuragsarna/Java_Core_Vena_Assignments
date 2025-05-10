package Question2;

public class BankingSystem {
    public void transferFunds(double amount, String fromAccount, String toAccount) throws BankingException {
        if (amount <= 0) {
            throw new InvalidAccountException("Invalid amount to transfer.");
        }
        if (fromAccount == null || fromAccount.isEmpty()) {
            throw new InvalidAccountException("Invalid source account.");
        }
        if (toAccount == null || toAccount.isEmpty()) {
            throw new InvalidAccountException("Invalid destination account.");
        }
        if (amount > 1000) {  // For example, this could represent insufficient funds
            throw new InsufficientFundsException("Insufficient funds for transfer.");
        }

        System.out.println("Transfer successful: " + amount + " from " + fromAccount + " to " + toAccount);
    }

    // Main method demonstrating catching exceptions separately and together
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        try {
            // Testing InsufficientFundsException
            bank.transferFunds(2000, "Account1", "Account2");
        } catch (InsufficientFundsException e) {
            System.err.println("InsufficientFundsException: " + e.getMessage());
        } catch (InvalidAccountException e) {
            System.err.println("InvalidAccountException: " + e.getMessage());
        } catch (BankingException e) {
            System.err.println("BankingException: " + e.getMessage());
        }

        try {
            // Testing InvalidAccountException
            bank.transferFunds(500, "", "Account2");
        } catch (InsufficientFundsException e) {
            System.err.println("InsufficientFundsException: " + e.getMessage());
        } catch (InvalidAccountException e) {
            System.err.println("InvalidAccountException: " + e.getMessage());
        } catch (BankingException e) {
            System.err.println("BankingException: " + e.getMessage());
        }

        // Catching the parent exception (BankingException) for both cases
        try {
            // Testing both exceptions together
            bank.transferFunds(2000, "", "Account2");
        } catch (BankingException e) {
            System.err.println("Caught BankingException: " + e.getMessage());
        }
    }
}
