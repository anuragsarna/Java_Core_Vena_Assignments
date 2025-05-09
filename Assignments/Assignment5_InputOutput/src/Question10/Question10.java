package Question10;

import java.io.File;

public class Question10 {
    public static void main(String[] args) {
        File folder = new File("src"); // Folder name or path

        if (folder.exists() && folder.isDirectory()) {
            File[] items = folder.listFiles();

            if (items != null && items.length > 0) {
                System.out.println("Contents of the 'documents' folder:");
                for (File item : items) {
                    if (item.isDirectory()) {
                        System.out.println("[DIR]  " + item.getName());
                    } else {
                        System.out.println("[FILE] " + item.getName());
                    }
                }
            } else {
                System.out.println("The 'documents' folder is empty.");
            }
        } else {
            System.out.println("The 'documents' folder does not exist or is not a directory.");
        }
    }
}
