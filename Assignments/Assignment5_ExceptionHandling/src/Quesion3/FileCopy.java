package Quesion3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy {

    public static void main(String[] args) {
        // Specify the input and output file paths
        String inputFilePath = "input.txt";  // Replace with your input file path
        String outputFilePath = "output.txt"; // Replace with your output file path

        // Use try-with-resources to automatically close the resources
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))
        ) {
            String line;

            // Read each line from the input file and write it to the output file
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();  // Write a new line after each line of text
            }
            System.out.println("File copied successfully.");

        } catch (IOException e) {
            // Catch any I/O exceptions and print the error message
            System.err.println("Error occurred while reading or writing files: " + e.getMessage());
        }
    }
}
