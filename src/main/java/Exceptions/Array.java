
package Exceptions;

public class Array {
    static class ArrayHandler {
        public static void handle(int arr[], int index) {
            try {
                if (index >= 0 && index < arr.length) {
                    System.out.println("Element at index " + index + ": " + arr[index]);
                } else {
                    throw new ArrayIndexOutOfBoundsException("Index out of bounds");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Exception found: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }

    public static void main(String args[]) {
        int[] arr = { 1, 2, 3, 4, 5 };
        ArrayHandler.handle(arr, 0);
        ArrayHandler.handle(arr, 5);
        ArrayHandler.handle(arr, 7);
        ArrayHandler.handle(arr, 2);
    }
}
