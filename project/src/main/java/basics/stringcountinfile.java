package basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class stringcountinfile {
    public static void main(String[] args) {
        String filePath = "demo2/src/main/java/com/example3/demo2/BASICPROGRAMMING/Test.txt";
        String targetString = "Test"; // Change this to the string you want to count

        int count = countStringOccurrences(filePath, targetString);
        System.out.println("The string \"" + targetString + "\" appears " + count + " times in the file.");
    }

    public static int countStringOccurrences(String filePath, String targetString) {
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                count += countOccurrences(line, targetString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }

    public static int countOccurrences(String text, String target) {
        int count = 0;
        int index = 0;
        while ((index = text.indexOf(target, index)) != -1) {
            count++;
            index += target.length();
        }
        return count;
    }
}
