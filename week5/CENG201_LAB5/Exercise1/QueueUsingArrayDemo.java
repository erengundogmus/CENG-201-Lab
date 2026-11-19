/**
 * QueueUsingArrayDemo.java
 *
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.11.2026
 */
public class QueueUsingArrayDemo {

    public static void main(String[] args) {
        String[] students = {
                "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
                "Elif", "Mustafa", "Fatma", "Can", "Ece",
                "Burak", "Deniz", "Emre", "Selin", "Mert",
                "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        Queue<String> queue = new Queue<>(10);
        for (int i = 0; i < 10; i++) {
            queue.enqueue(students[i]);
        }

        System.out.println("Original Queue: " + queue);
        System.out.println("Queue Size: " + queue.size());
        System.out.println("First Student: " + queue.peek());
        System.out.println();

        System.out.println("Removing three students:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Removed: " + queue.dequeue());
        }

        System.out.println();
        System.out.println("Queue After Removal: " + queue);
        System.out.println("Final Queue Size: " + queue.size());

    }
}
