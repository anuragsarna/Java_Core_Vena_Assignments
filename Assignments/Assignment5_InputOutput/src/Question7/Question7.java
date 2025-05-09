package Question7;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;

public class Question7 {
    public static void main(String[] args) {
        String fileName = "src/Question7/log.txt";
        String currentDate = LocalDate.now().toString(); // Format: YYYY-MM-DD
        String lineToAppend = "Last updated on " + currentDate;

        try (FileWriter writer = new FileWriter(fileName, true)) { // 'true' enables appending
            writer.write(lineToAppend + System.lineSeparator());
            System.out.println("Date appended to log.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}

