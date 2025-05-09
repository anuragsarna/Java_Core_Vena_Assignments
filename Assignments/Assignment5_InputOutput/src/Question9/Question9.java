package Question9;

import java.io.File;

public class Question9 {
    public static void main(String[] args) {
        File file = new File("src/Question9/oldfile.txt");

        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File 'oldfile.txt' was deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File 'oldfile.txt' does not exist.");
        }
    }
}

