/**
 * TokenStack.java
 *
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        26.10.2026
 */
public class TokenStack {

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node top;

    public TokenStack() {
        top = null;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot pop from an empty stack.");
        }
        String value = top.data;
        top = top.next;
        return value;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
