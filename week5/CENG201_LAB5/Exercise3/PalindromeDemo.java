/**
 * PalindromeDemo.java
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        19.11.2026
 */
import java.util.Scanner;

public class PalindromeDemo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = input.nextLine();

        Stack stack = new Stack(text.length());
        Queue queue = new Queue(text.length());

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            stack.push(ch);
            queue.enqueue(ch);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char stackChar = stack.pop();
            char queueChar = queue.dequeue();
            if (stackChar != queueChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("\"" + text + "\" is a palindrome.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome.");
        }

        input.close();
    }
}
