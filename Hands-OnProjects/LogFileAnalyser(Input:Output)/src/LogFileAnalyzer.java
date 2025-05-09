import java.io.*;
import java.nio.file.*;
import java.util.List;

public class LogFileAnalyzer {
    public static void main(String[] args) {

        String inputFileName = "src/server.log";
        String outputFileName = "src/summary.txt";

        if (args.length >= 1) inputFileName = args[0];
        if (args.length >= 2) outputFileName = args[1];

        int totalLines = 0;
        int errorCount = 0;
        int warningCount = 0;

        try {
            List<String> lines = Files.readAllLines(Paths.get(inputFileName));
            totalLines = lines.size();

            System.out.println(lines);
            for (String line : lines) {
                if (line.contains("ERROR")) errorCount++;
                if (line.contains("WARNING")) warningCount++;
            }

            double errorPercent = totalLines == 0 ? 0 : (errorCount * 100.0) / totalLines; //Ternary Operator = condition ? valueIfTrue : valueIfFalse
            double warningPercent = totalLines == 0 ? 0 : (warningCount * 100.0) / totalLines;

            StringBuilder report = new StringBuilder();
            report.append("Log Summary Report\n");
            report.append("------------------\n");
            report.append("Total log entries: ").append(totalLines).append("\n");
            report.append("ERROR entries: ").append(errorCount)
                    .append(String.format(" (%.2f%%)", errorPercent)).append("\n");
            report.append("WARNING entries: ").append(warningCount)
                    .append(String.format(" (%.2f%%)", warningPercent)).append("\n");

            Files.write(Paths.get(outputFileName), report.toString().getBytes()); // Converts the String into a byte array, because Files.write() needs data in bytes.

            System.out.println("Summary report generated: " + outputFileName);

        } catch (NoSuchFileException e) {
            System.err.println("Error: Input file not found - " + inputFileName);
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }
}
