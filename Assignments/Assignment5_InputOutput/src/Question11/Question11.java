package Question11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Question11 {
    public static void main(String[] args) {
        String sourceFile = "src/Question11/image.jpg";
        String destinationFile = "src/Question11/image_copy.jpg";

        try (
                FileInputStream inputStream = new FileInputStream(sourceFile);
                FileOutputStream outputStream = new FileOutputStream(destinationFile)
        ) {
            byte[] buffer = new byte[1024];
            int bytesRead;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("File copied successfully to " + destinationFile);
        } catch (IOException e) {
            System.out.println("An error occurred during file copying.");
            e.printStackTrace();
        }
    }
}
