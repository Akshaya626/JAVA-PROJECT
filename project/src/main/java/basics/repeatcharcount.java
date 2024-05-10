package basics;

import java.util.Scanner;

public class repeatcharcount {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String:");
        String inputString = scanner.nextLine();
        scanner.close();

        String repeatedCharacters = findRepeatedCharacters(inputString);
        System.out.println("Repetitive characters in the string: " + repeatedCharacters);
    }

    public static String findRepeatedCharacters(String str) {
        StringBuilder repeatedChars = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar) && // Check if the character is repeated
                    repeatedChars.indexOf(String.valueOf(currentChar)) == -1) { // Check if it's not already added
                repeatedChars.append(currentChar).append(" ");
            }
        }

        return repeatedChars.toString().trim();
    }
}