package Question13;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class LogFileCreator {
    public static void main(String[] args) {
        String logFile = "server.log"; // Log file path

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(logFile))) {
            // Writing sample log entries to the log file
            writer.write("INFO: Server started successfully.\n");
            writer.write("INFO: Listening on port 8080.\n");
            writer.write("ERROR: Unable to connect to database.\n");
            writer.write("INFO: Server is running smoothly.\n");
            writer.write("ERROR: Timeout occurred during request processing.\n");

            System.out.println("Log file 'server.log' created and entries added successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while creating or writing to the log file.");
            e.printStackTrace();
        }
    }
}

