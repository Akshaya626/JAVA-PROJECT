package Exceptions;

import java.util.Scanner;

public class Main {

    static class NullPointerExceptionHandler {
        public static void handle(String str) {
            try {
                if (str == null) {
                    throw new NullPointerException("String cannot be null");
                } else {

                    System.out.println("Length of the string: " + str.length());
                }
            } catch (NullPointerException e) {
                System.out.println("NullPointerException caught: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String str = null;
        scanner.close();
        NullPointerExceptionHandler.handle(str);

    }
}
