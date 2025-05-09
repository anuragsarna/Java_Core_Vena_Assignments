package Question5;

import java.io.*;

public class Question5 {
    public static void main(String[] args) {
        String sourceFile = "src/Question5/source.txt";
        String destinationFile = "src/Question5/backup.txt";

        try (
                FileReader fr = new FileReader(sourceFile);
                BufferedReader reader = new BufferedReader(fr);
                FileWriter fw = new FileWriter(destinationFile);
                BufferedWriter writer = new BufferedWriter(fw)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Preserve line breaks
            }
            System.out.println("Contents copied from source.txt to backup.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred during file copying.");
            e.printStackTrace();
        }
    }
}
