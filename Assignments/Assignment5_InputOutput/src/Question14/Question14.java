package Question14;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Question14 {
    public static void main(String[] args) {
        Path sourceFile = Paths.get("src/Question14/source.txt");
        Path destinationFile = Paths.get("src/Question14/destination.txt");

        try {
            // Check if the source file exists
            if (!Files.exists(sourceFile)) {
                throw new IOException("Source file does not exist.");
            }

            // Copy the file using NIO
            Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully to " + destinationFile.toString());

        } catch (IOException e) {
            // Proper exception handling with detailed error messages
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

