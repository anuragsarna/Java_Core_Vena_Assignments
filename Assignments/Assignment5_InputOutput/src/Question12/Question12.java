package Question12;

import java.io.*;

public class Question12 {
    public static void main(String[] args) {
        String folderPath = "src";
        String outputFile = "src/Question12/merged.txt";

        File folder = new File(folderPath);
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt"));

        if (files != null && files.length > 0) {
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
                for (File file : files) {
                    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            writer.write(line);
                            writer.newLine(); // Adds a new line between file contents
                        }
                    } catch (IOException e) {
                        System.out.println("Error reading file: " + file.getName());
                        e.printStackTrace();
                    }
                }
                System.out.println("All .txt files have been merged into " + outputFile);
            } catch (IOException e) {
                System.out.println("Error writing to the merged file.");
                e.printStackTrace();
            }
        } else {
            System.out.println("No .txt files found in the folder.");
        }
    }
}
