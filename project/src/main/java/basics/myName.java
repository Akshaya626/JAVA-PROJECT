package basics;

import java.util.Scanner;

public class myName {
    public static void main(String[] args) throws Exception {
        try (Scanner value = new Scanner(System.in)) {
            System.out.println("Enter your name");
            String name = value.nextLine();
            System.out.println("My name is " + name);
        }
    }

}
