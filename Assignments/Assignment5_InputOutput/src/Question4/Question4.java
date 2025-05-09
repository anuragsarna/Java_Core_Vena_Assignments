package Question4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question4 {
    public static void main(String[] args) {
        String fileName = "src/Question4/data.txt";
        int lineCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            while (reader.readLine() != null) {
                lineCount++;
            }
            System.out.println("Number of lines in " + fileName + ": " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}