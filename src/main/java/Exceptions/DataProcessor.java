package Exceptions;

import java.util.Scanner;

public class DataProcessor {

    public static void getData(String sentence) {
        extractData(sentence);
    }

    public static void extractData(String sentence) {
        ReadData(sentence);
    }

    private static void ReadData(String sentence) {
        try {
            if (sentence == null || sentence.isEmpty()) {
                throw new NullPointerException("Input sentence is empty");
            }
            System.out.println("ReadData : " + sentence);
        } catch (NullPointerException e) {
            System.out.println("Null pointer exception caught in ReadData method: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();
        ReadData(input);
    }
}
