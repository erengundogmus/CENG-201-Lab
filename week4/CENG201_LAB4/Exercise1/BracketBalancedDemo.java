/**
 * BracketBalancedDemo.java
 *
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        26.10.2026
 */
public class BracketBalancedDemo {

    public static void main(String[] args) {
        String[] expressions = {
                "[{()}]",
                "[()()]{}",
                "([]",
                "([{]})",
                "abc{defg(ijk)l[mn]op}qr",
                "a(bc)def]"
        };

        System.out.println("========== BALANCED BRACKET TEST ==========");
        for (String expression : expressions) {
            boolean result = BalancedBrackets.isBalanced(expression);
            System.out.println("Input: " + expression + " -> Output: " + result);
        }
    }
}
