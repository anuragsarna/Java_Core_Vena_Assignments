package Question3;

import java.io.File;

public class Question3 {
    public static void main(String[] args) {
        File file = new File("src/Question3/report.pdf");

        if (file.exists()) {
            System.out.println("File 'report.pdf' exists.");
            System.out.println("File size: " + file.length() + " bytes");
        } else {
            System.out.println("File 'report.pdf' does not exist in the current directory.");
        }
    }
}
