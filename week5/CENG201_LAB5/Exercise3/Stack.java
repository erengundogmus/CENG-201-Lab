/**
 * Stack.java
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.11.2026
 */
public class Stack {

    private char[] items;
    private int top;

    public Stack(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("Capacity cannot be negative.");
        }
        items = new char[capacity];
        top = -1;
    }

    public void push(char value) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full.");
        }
        top++;
        items[top] = value;
    }

    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        char value = items[top];
        top--;
        return value;
    }

    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek at an empty stack.");
        }
        return items[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == items.length - 1;
    }
}
