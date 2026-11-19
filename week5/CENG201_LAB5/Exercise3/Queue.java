/**
 * Queue.java
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.11.2026
 */
public class Queue {

    private char[] items;
    private int front;
    private int rear;
    private int count;

    public Queue(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative.");
        }
        items = new char[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(char value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }
        if (items.length == 0) {
            throw new IllegalStateException("Cannot enqueue into a zero-capacity queue.");
        }
        rear = (rear + 1) % items.length;
        items[rear] = value;
        count++;
    }

    public char dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        }
        char value = items[front];
        front = (front + 1) % items.length;
        count--;
        return value;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek at an empty queue.");
        }
        return items[front];
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public boolean isFull() {
        return count == items.length;
    }

    public int size() {
        return count;
    }
}
