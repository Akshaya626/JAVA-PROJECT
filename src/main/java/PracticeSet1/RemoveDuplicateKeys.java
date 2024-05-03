package PracticeSet1;

import java.util.Hashtable;
import java.util.HashSet;
import java.util.Map;

public class RemoveDuplicateKeys {
    public static void main(String[] args) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Apple");
        hashtable.put(2, "Banana");
        hashtable.put(3, "Orange");
        hashtable.put(4, "Apple");
        hashtable.put(5, "Grapes");
        hashtable.put(6, "Orange");

        System.out.println("Original Hashtable:");

        displayHashtable(hashtable);

        removeDuplicateValues(hashtable);

        System.out.println("\nHashtable after removing duplicate values:");
        displayHashtable(hashtable);
    }

    public static void removeDuplicateValues(Hashtable<Integer, String> hashtable) {

        HashSet<String> uniqueValues = new HashSet<>();

        HashSet<Integer> keysToRemove = new HashSet<>();

        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            String value = entry.getValue();
            if (!uniqueValues.contains(value)) {
                uniqueValues.add(value);
            } else {
                keysToRemove.add(entry.getKey());
            }
        }
        for (Integer key : keysToRemove) {
            hashtable.remove(key);
        }
    }

    // Method to display the content of the Hashtable
    public static void displayHashtable(Hashtable<Integer, String> hashtable) {
        for (Map.Entry<Integer, String> entry : hashtable.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
