package Question1;

import java.io.IOException;

public class Question1 {
    public void readData() throws IOException {
        // Simulating a potential file reading error
        throw new IOException("Error reading data from file.");
    }

    // Method to process data and handle IOException by throwing a custom exception
    public void processData() throws DataProcessingException {
        try {
            // Attempting to read data
            readData();
        } catch (IOException e) {
            // Catching IOException and throwing a custom DataProcessingException
            throw new DataProcessingException("Error processing data: " + e.getMessage());
        }
    }

    // Main method that catches and logs DataProcessingException
    public static void main(String[] args) {
        Question1 processor = new Question1(); // Create an instance of the correct class

        try {
            // Calling processData which may throw DataProcessingException
            processor.processData();
        } catch (DataProcessingException e) {
            // Catching and logging DataProcessingException
            System.err.println("Data processing failed: " + e.getMessage());
        }
    }
}
