package PracticeQuestions;

import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {

        int x, y, temp;
        Scanner in = new Scanner(System.in);
        x = in.nextInt();
        y = in.nextInt();
        in.close();
        System.out.println("x=" + x + " " + "y=" + y);
        temp = x;
        x = y;
        y = temp;
        System.out.println("x=" + x + " " + "y=" + y);

    }

}