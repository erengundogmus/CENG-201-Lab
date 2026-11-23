public class Stack {

    private Node top;

    public Stack() {
        top = null;
    }

    // STEP 1:
    // Implement push().
    // 1. Create a new Node using the given value.
    // 2. Set the new node's next reference to the current top.
    // 3. Update top to point to the new node.

    public void push(String value) {
        Node node = new Node(value);
        node.next = top;
        top = node;
    }

    // STEP 2:
    // Implement pop().
    // 1. Check whether the stack is empty.
    // 2. If it is empty, return null.
    // 3. Store the data of the top node.
    // 4. Move top to the next node.
    // 5. Return the stored data.

    public String pop() {
        if (isEmpty()) {
            return null;
        }
        String value = top.data;
        top = top.next;
        return value;
    }

    // STEP 3:
    // Implement peek().
    // 1. Check whether the stack is empty.
    // 2. If empty, return null.
    // 3. Otherwise, return the data of the top node.
    // Do not remove the node.

    public String peek() {
        return isEmpty() ? null : top.data;
    }

    // STEP 4:
    // Return true if top is null.
    // Otherwise, return false.

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {

        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }

        Node current = top;

        while (current != null) {

            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println();
    }
}
