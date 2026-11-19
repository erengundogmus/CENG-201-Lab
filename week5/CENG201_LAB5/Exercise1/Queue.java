/**
 * Queue.java
 *
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.11.2026
 */
public class Queue<T> {

    private T[] items;
    private int front;
    private int rear;
    private int count;

    @SuppressWarnings("unchecked")
    public Queue(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity must be positive.");
        }
        items = (T[]) new Object[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }

    public void enqueue(T value) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full.");
        }

        rear++;
        if (rear >= items.length) {
            throw new IllegalStateException(
                    "No array position remains at the rear. Use a circular queue or shift the elements.");
        }
        items[rear] = value;
        count++;
    }

    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        }

        T removedValue = items[front];
        items[front] = null;
        front++;
        count--;
        return removedValue;
    }

    public T peek() {
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

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < count; i++) {
            int index = front + i;
            result.append(items[index]);
            if (i < count - 1) {
                result.append(", ");
            }
        }
        return result.append("]").toString();
    }
}
