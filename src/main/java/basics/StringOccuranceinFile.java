package basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class StringOccuranceinFile {

    public static void main(String[] args) {
        // Path to the input file
        String filePath = "demo2/src/main/java/com/example3/demo2/BASICPROGRAMMING/Test.txt";

        // Read file content and store words in ArrayList
        ArrayList<String> wordsList = readWordsFromFile(filePath);

        // Count occurrences of each word
        Map<String, Integer> wordCountMap = countStringOccurrences(wordsList);

        // Display word count
        System.out.println("Word Count:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    // Read file content and store words in ArrayList
    public static ArrayList<String> readWordsFromFile(String filePath) {
        ArrayList<String> wordsList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace
                for (String word : words) {
                    wordsList.add(word.toLowerCase()); // Convert to lowercase and add to list
                }
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
        return wordsList;
    }

    // Count occurrences of each word in the ArrayList
    public static Map<String, Integer> countStringOccurrences(ArrayList<String> wordsList) {
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : wordsList) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }
        return wordCountMap;
    }
}
