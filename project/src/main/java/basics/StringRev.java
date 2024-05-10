package basics;

import java.util.Scanner;

public class StringRev {
    public static void main(String[] args) {
        String finalText = "";
        @SuppressWarnings("resource")
        Scanner value = new Scanner(System.in);
        System.out.println("Enter the string value:");
        String S = value.nextLine();
        int i;
        // String finalText = " ";
        for (i = S.length(); i > 0; i--) {
            finalText = finalText + S.charAt(i - 1);
        }

        System.out.println(finalText);
    }
}
