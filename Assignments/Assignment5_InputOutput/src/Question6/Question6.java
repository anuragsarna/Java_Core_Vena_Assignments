package Question6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question6 {
    public static void main(String[] args) {
        String fileName = "src/Question6/paragraph.txt";
        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words
                String[] words = line.split("\\W+"); // Splits by non-word characters
                for (String word : words) {
                    if (word.equalsIgnoreCase("Java")) { // Case-insensitive match
                        count++;
                    }
                }
            }
            System.out.println("The word 'Java' appears " + count + " times in " + fileName + ".");
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
