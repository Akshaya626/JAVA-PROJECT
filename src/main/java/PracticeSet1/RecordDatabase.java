package PracticeSet1;

import java.util.HashMap;

public class RecordDatabase {
    public static void main(String[] args) {

        HashMap<Integer, String> recordDatabase = new HashMap<>();

        insertRecord(recordDatabase, 101, "John");
        insertRecord(recordDatabase, 102, "Alice");
        insertRecord(recordDatabase, 103, "Bob");
        insertRecord(recordDatabase, 104, "Emily");

        System.out.println("Retrieving records:");
        retrieveRecord(recordDatabase, 102);
        retrieveRecord(recordDatabase, 105);

        System.out.println("\nRemoving record:");
        removeRecord(recordDatabase, 103);

        System.out.println("\nRetrieving updated records:");
        retrieveRecord(recordDatabase, 103);
        retrieveRecord(recordDatabase, 104);
    }

    public static void insertRecord(HashMap<Integer, String> database, int key, String value) {
        database.put(key, value);
        System.out.println("Inserted record with key " + key + " and value " + value);
    }

    public static void retrieveRecord(HashMap<Integer, String> database, int key) {
        String value = database.get(key);
        if (value != null) {
            System.out.println("Record found: Key " + key + ", Value " + value);
        } else {
            System.out.println("Record with key " + key + " not found");
        }
    }

    public static void removeRecord(HashMap<Integer, String> database, int key) {
        String value = database.remove(key);
        if (value != null) {
            System.out.println("Removed record with key " + key + " and value " + value);
        } else {
            System.out.println("Record with key " + key + " not found");
        }
    }
}
