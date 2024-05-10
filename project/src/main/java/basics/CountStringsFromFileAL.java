package basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class CountStringsFromFileAL {
    public static void main(String[] args) {
        String filePath = "src/Test.txt"; // Provide the path to your file

        ArrayList<String> wordsList = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Split the line into words based on whitespace
                String[] words = line.split("\\s+");
                for (String word : words) {
                    wordsList.add(word);
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }

        int totalStrings = wordsList.size();
        System.out.println("Total strings in the file: " + totalStrings);
    }
}
