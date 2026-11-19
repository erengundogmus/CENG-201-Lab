/**
 * Queue.java
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.11.2026
 */
public class Queue {

    private Node front;
    private Node rear;
    private int size;

    public Queue() {
        front = null;
        rear = null;
        size = 0;
    }

    public void enqueue(String customerName) {
        Node newNode = new Node(customerName);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        }

        String customerName = front.customerName;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
        return customerName;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.customerName);
            if (current.next != null) {
                System.out.print(" -> ");
            }
            current = current.next;
        }
        System.out.println();
    }
}
