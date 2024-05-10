package basics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadFileAndCalculateBalance {
    public static void main(String[] args) {
        // Replace "path/to/file.txt" with the actual file path
        String filePath = "demo2/src/main/java/com/example3/demo2/BASICPROGRAMMING/Test1.txt";
        Map<String, Integer> map = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Assuming each line contains a key and a value separated by a comma
                String[] parts = line.split(",");
                if (parts.length == 2) {
                    String key = parts[0].trim();
                    Integer value = Integer.parseInt(parts[1].trim());
                    map.merge(key, value, Integer::sum);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        printSpecificKeyValue(map, "Alice");
    }

    public static void printSpecificKeyValue(Map<String, Integer> map, String key) {
        if (map.containsKey(key)) {
            System.out.println("The balance for'" + key + "' is: " + map.get(key));
        } else {
            System.out.println("Key '" + key + "' does not exist in the map.");
        }
    }
}
