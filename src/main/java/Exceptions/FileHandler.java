
package Exceptions;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class FileHandler {

    public static void handle(String file) {
        Path path = Paths.get(file);

        try {
            if (!Files.exists(path)) {
                throw new IOException("File not found: " + file);
            }
            System.out.println("File found: " + file);

        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String args[]) {
        String file = "project//src//main//java//Exceptions//f1.txt";
        handle(file);
    }
}
