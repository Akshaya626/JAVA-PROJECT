package PracticeSet1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeleteDuplicates {
    public static void main(String[] args) {

        List<String> L1 = new ArrayList<>();
        L1.add("Apple");
        L1.add("Banana");
        L1.add("Apple");
        L1.add("Orange");
        L1.add("Banana");

        List<String> L2 = deleteDuplicates(L1);

        System.out.println("List without duplicates:");
        for (String item : L2) {
            System.out.println(item);
        }
    }

    public static <T> List<T> deleteDuplicates(List<T> list) {

        Set<T> set = new HashSet<>(list);
        List<T> result = new ArrayList<>(set);

        return result;
    }
}
