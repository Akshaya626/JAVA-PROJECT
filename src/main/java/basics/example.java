package basics;

import java.util.*;

public class example {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();
        System.out.println("Enter n value:");
        int n = scanner.nextInt();
        int a = 0, b = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;

        }

    }
}