package PracticeSet1;

import java.util.Hashtable;
import java.util.Map;

public class SearchHashTable {
    public static void main(String[] args) {

        Hashtable<Integer, String> hashTable = new Hashtable<>();

        hashTable.put(1, "Apple");
        hashTable.put(2, "Banana");
        hashTable.put(3, "Orange");
        hashTable.put(4, "Grapes");
        hashTable.put(5, "Mango");

        int k = 3;
        searchForKey(hashTable, k);

        String v = "Grapes";
        searchForValue(hashTable, v);
    }

    public static void searchForKey(Hashtable<Integer, String> hashTable, int k) {
        for (Map.Entry<Integer, String> entry : hashTable.entrySet()) {
            if (entry.getKey() == k) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                return;
            }
        }
        System.out.println("Key " + k + " is not present in the Hashtable.");
    }

    public static void searchForValue(Hashtable<Integer, String> hashTable, String v) {
        for (Map.Entry<Integer, String> entry : hashTable.entrySet()) {
            if (entry.getValue().equals(v)) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
                return;
            }
        }
        System.out.println("Value " + v + " is not present in the Hashtable.");
    }
}
