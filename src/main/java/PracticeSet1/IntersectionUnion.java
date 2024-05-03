package PracticeSet1;

import java.util.HashSet;
import java.util.Set;

public class IntersectionUnion {
    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);

        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);

        Set<Integer> union = new HashSet<>(set1);
        union.addAll(set2);

        System.out.println("Intersection: " + intersection);

        System.out.println("Union: " + union);
    }
}
