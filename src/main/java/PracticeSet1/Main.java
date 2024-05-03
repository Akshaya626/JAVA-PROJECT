package PracticeSet1;

public class Main {
    public static void main(String[] args) {
        // Testing the Stack class
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.display();

        int poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);
        stack.display();

        poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);
        stack.display();

        poppedItem = stack.pop();
        System.out.println("Popped item: " + poppedItem);
        stack.display();

        poppedItem = stack.pop();
    }
}
