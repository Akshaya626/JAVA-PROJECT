package basics;

import java.io.*;
import java.util.*;

public class CSVExample {
    public static void main(String[] args) {
        String fileName = "sample.csv";
        List<String[]> data = new ArrayList<>();
        data.add(new String[] { "Alice", "30", "2500.75" });
        data.add(new String[] { "Bob", "45", "1500.00" });
        data.add(new String[] { "Charlie", "25", "3200.50" });

        // Write data to CSV file
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (String[] entry : data) {
                writer.println(String.join(",", entry));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing the CSV file.");
            e.printStackTrace();
        }

        // Ask for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String inputName = scanner.nextLine();

        // Read data from CSV file and print the specific name's age and balance
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if (values[0].equals(inputName)) {
                    System.out.println("Output: " + String.join("-", values));
                    break;
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the CSV file.");
            e.printStackTrace();
        }
    }
}
