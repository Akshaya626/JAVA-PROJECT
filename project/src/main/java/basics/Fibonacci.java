package basics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int firstTerm = 0, secondTerm = 1;
        Scanner number = new Scanner(System.in);
        System.out.println("Enter num value");
        int n = number.nextInt();
        System.out.println("Fibonacci Series till " + n + " terms:");
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        number.close(); // Close the scanner when done
    }
}
