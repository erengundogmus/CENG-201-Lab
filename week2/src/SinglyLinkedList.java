 /** Your Name: Eren Gündoğmuş
 * Your Student ID: 230446010
 * Your Date: 12.10.2026     **/



/** A simple singly linked list with middle-node operations. */
public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("NULL");
    }

    /** Returns the middle node; for even length, returns the second middle. */
    public Node findMiddle() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        if (count == 0) {
            return null;
        }

        int middleIndex = count / 2;
        current = head;
        for (int index = 0; index < middleIndex; index++) {
            current = current.next;
        }
        return current;
    }

    /** Deletes the middle node; for even length, deletes the second middle. */
    public void deleteMiddle() {
        if (head == null) {
            return;
        }

        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }

        int middleIndex = count / 2;
        if (middleIndex == 0) {
            head = head.next;
            return;
        }

        current = head;
        for (int index = 0; index < middleIndex - 1; index++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public Node getHead() {
        return head;
    }
}
