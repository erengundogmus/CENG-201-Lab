/**
 * BracketStack.java
 *
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        26.10.2026
 */
public class BracketStack {

    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public BracketStack() {
        top = null;
    }

    // Add an element to the top of the stack.
    public void push(char value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    // Remove and return the top element.
    public char pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        char value = top.data;
        top = top.next;
        return value;
    }

    // Return the top element without removing it.
    public char peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot peek at an empty stack.");
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
