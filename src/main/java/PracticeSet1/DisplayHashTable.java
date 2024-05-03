package PracticeSet1;

import java.util.Hashtable;

public class DisplayHashTable {
    public static void main(String[] args) {
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("A", 1);
        hashtable.put("B", 2);
        hashtable.put("C", 3);
        for (String key : hashtable.keySet()) {
            Integer value = hashtable.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
