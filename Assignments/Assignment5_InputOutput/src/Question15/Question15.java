package Question15;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Question15 {
    public static void main(String[] args) {
        String inputFile = "src/Question15/input.txt";
        String outputFile = "src/Question15/charcount.txt";

        // Initialize a map to store character counts
        Map<Character, Integer> charCountMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            int ch;
            // Read the file character by character
            while ((ch = reader.read()) != -1) {
                char character = (char) ch;

                // Increment the count for the character
                charCountMap.put(character, charCountMap.getOrDefault(character, 0) + 1);
            }

            // Write the character frequencies to the output file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
                    writer.write(entry.getKey() + ": " + entry.getValue());
                    writer.newLine();
                }

                System.out.println("Character frequencies have been written to " + outputFile);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading or writing the file.");
            e.printStackTrace();
        }
    }
}

