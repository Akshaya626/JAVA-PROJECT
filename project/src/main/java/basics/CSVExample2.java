package basics;

import java.io.*;
import java.util.*;

public class CSVExample2 {
    public static void main(String[] args) {

        // Creating name-age file
        String fileName = "sampleNameAge.csv";
        List<String[]> data = new ArrayList<>();
        data.add(new String[] { "Alice", "30" });
        data.add(new String[] { "Bob", "45" });
        data.add(new String[] { "Charlie", "25", });

        // Write data to CSV file
        try (PrintWriter writer = new PrintWriter(new File(fileName))) {
            for (String[] entry : data) {
                writer.println(String.join(",", entry));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing the CSV file.");
            e.printStackTrace();
        }
        // Creating name-balance file

        String fileName1 = "sampleNameBalance.csv";
        List<String[]> data1 = new ArrayList<>();
        data1.add(new String[] { "Alice", "2500.75" });
        data1.add(new String[] { "Bob", "1500.00" });
        data1.add(new String[] { "Charlie", "3200.50" });

        // Write data to CSV file
        try (PrintWriter writer1 = new PrintWriter(new File(fileName1))) {
            for (String[] entry : data1) {
                writer1.println(String.join(",", entry));
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while writing the CSV file.");
            e.printStackTrace();
        }
        String ageFileName = "sampleNameAge.csv";
        String balanceFileName = "sampleNameBalance.csv";

        // Ask for user input
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String inputName = scanner.nextLine();

        // Read data from age file and store in a map
        Map<String, String> ageMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ageFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                ageMap.put(values[0], values[1]);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the age CSV file.");
            e.printStackTrace();
        }

        // Read data from balance file and store in a map
        Map<String, String> balanceMap = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(balanceFileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                balanceMap.put(values[0], values[1]);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the balance CSV file.");
            e.printStackTrace();
        }

        // Print the name, age, and balance if the name exists in both files
        if (ageMap.containsKey(inputName) && balanceMap.containsKey(inputName)) {
            System.out.println("Output: " + inputName + "-" + ageMap.get(inputName) + "-" + balanceMap.get(inputName));
        } else {
            System.out.println("Name not found in both files.");
        }

    }
}