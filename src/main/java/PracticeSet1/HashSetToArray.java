package PracticeSet1;

import java.util.HashSet;

public class HashSetToArray {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grapes");
        hashSet.add("Mango");

        System.out.println("Content of the HashSet:");
        System.out.println(hashSet);

        String[] array = new String[hashSet.size()];
        hashSet.toArray(array);

        System.out.println("\nContent of the Array:");
        for (String item : array) {
            System.out.println(item);
        }
    }
}
