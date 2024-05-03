package PracticeSet1;

import java.util.ArrayList;

class Stack {
    private ArrayList<Integer> stack;

    public Stack() {
        stack = new ArrayList<>();
    }

    public void push(int item) {
        stack.add(item);
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        } else {
            int poppedItem = stack.remove(stack.size() - 1);
            return poppedItem;
        }
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.print("Current stack: ");
            for (int i = stack.size() - 1; i >= 0; i--) {
                System.out.print(stack.get(i) + " ");
            }
            System.out.println();
        }
    }
}
