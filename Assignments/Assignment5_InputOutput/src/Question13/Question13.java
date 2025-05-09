package Question13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Question13 {
    public static void main(String[] args) {
        String logFile = "src/Question13/server.log";

        try (BufferedReader reader = new BufferedReader(new FileReader(logFile))) {
            String line;

            while (true) {
                if ((line = reader.readLine()) != null) {
                    if (line.contains("ERROR")) {
                        System.out.println(line);
                    }
                } else {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        System.out.println("Thread interrupted.");
                        break;
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the log file.");
            e.printStackTrace();
        }
    }
}
