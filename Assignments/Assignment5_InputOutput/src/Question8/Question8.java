package Question8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question8 {
    public static void main(String[] args) {
        String fileName = "src/Question8/employees.csv";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line.toUpperCase());
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the CSV file.");
            e.printStackTrace();
        }
    }
}

