package PracticeSet1;

public class Q3 {
    private Node head;

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Q3() {
        head = null;
    }

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;
        if (current == null) {
            System.out.println("Linked list is empty");
            return;
        }
        System.out.println("Linked list:");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void sort() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node previous = null;

            while (current.next != null) {
                if (current.data > current.next.data) {
                    Node temp = current.next;
                    current.next = current.next.next;
                    temp.next = current;

                    if (previous != null) {
                        previous.next = temp;
                    } else {
                        head = temp;
                    }

                    previous = temp;
                    swapped = true;
                } else {
                    previous = current;
                    current = current.next;
                }
            }
        } while (swapped);
    }

    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        Q3 list = new Q3();

        list.insert(10);
        list.insert(5);
        list.insert(30);
        list.insert(20);
        list.insert(15);

        System.out.println("Original linked list:");
        list.display();

        list.sort();
        System.out.println("\nLinked list after sorting:");
        list.display();

        list.reverse();
        System.out.println("\nLinked list after reversing:");
        list.display();
    }
}
