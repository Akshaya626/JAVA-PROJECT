package PracticeSet1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        ArrayList<String> myList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nArrayList Operations:");
            System.out.println("1. Add element");
            System.out.println("2. Retrieve element");
            System.out.println("3. Remove element");
            System.out.println("4. Display list");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:

                    System.out.print("Enter element to add: ");
                    String elementToAdd = scanner.next();
                    myList.add(elementToAdd);
                    System.out.println(elementToAdd + " added to the ArrayList.");
                    break;
                case 2:

                    System.out.print("Enter index to retrieve element from: ");
                    int indexToRetrieve = scanner.nextInt();
                    if (indexToRetrieve >= 0 && indexToRetrieve < myList.size()) {
                        String retrievedElement = myList.get(indexToRetrieve);
                        System.out.println("Element at index " + indexToRetrieve + " is: " + retrievedElement);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 3:

                    System.out.print("Enter index to remove element from: ");
                    int indexToRemove = scanner.nextInt();
                    if (indexToRemove >= 0 && indexToRemove < myList.size()) {
                        String removedElement = myList.remove(indexToRemove);
                        System.out.println("Element " + removedElement + " removed from index " + indexToRemove);
                    } else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 4:

                    displayList(myList);
                    break;
                case 5:

                    System.out.println("Exiting program...");
                    System.exit(0);
                default:

                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void displayList(ArrayList<String> list) {
        if (list.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Elements in the list:");
            for (int i = 0; i < list.size(); i++) {
                System.out.println(i + ": " + list.get(i));
            }
        }
    }
}
