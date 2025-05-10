package Question4;

public class ExceptionWrapperDemo {

    public static void riskyOperation() {
        int result = 10 / 0;  // This will throw ArithmeticException
    }

    public static void handleAndWrapException() throws CustomException {
        try {
            riskyOperation();
        } catch (ArithmeticException e) {
            // Wrap the original exception in CustomException, preserving stack trace
            throw new CustomException("Error occurred in risky operation", e);
        }
    }

    public static void main(String[] args) {
        try {
            handleAndWrapException();
        } catch (CustomException e) {
            System.err.println("Caught CustomException: " + e.getMessage());
            e.printStackTrace();  // This shows both the custom message and original cause
        }
    }
}

