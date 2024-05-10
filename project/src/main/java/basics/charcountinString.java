package basics;

import java.util.Scanner;

public class charcountinString {
    public static void main(String args[]) {
        try (Scanner Str = new Scanner(System.in)) {
            System.out.println("Enter the String:");
            String str = Str.nextLine();
            // String str = "Akshaya";
            String completed = "";
            for (int i = 0; i < str.length(); i++) {
                int count = 0;
                for (int j = i; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {
                        count++;
                    }
                }
                String s = String.valueOf(str.charAt(i));
                if (!completed.contains(s)) {
                    completed = completed + str.charAt(i);
                    System.out.println("Total number of count of occurance of " + str.charAt(i) + " is " + count);
                }
            }
        }
    }
}
