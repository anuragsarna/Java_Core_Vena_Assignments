package Question1;

import java.io.FileWriter;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
        String fileName = "src/Question1/notes.txt";
        String content = "This is my first file in Java.";

        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(content);
            writer.close();
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
