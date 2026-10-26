/**
 * BalancedBrackets.java
 *
 * Your Name:        Eren Gündoğmuş
 * Your Student ID:  230446010
 * Your Date:        26.10.2026
 */
public class BalancedBrackets {

    public static boolean isBalanced(String s) {
        if (s == null) {
            return false;
        }

        BracketStack stack = new BracketStack();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);

            if (current == '(' || current == '[' || current == '{') {
                stack.push(current);
            } else if (current == ')' || current == ']' || current == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char opening = stack.pop();
                if (!isMatchingPair(opening, current)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isMatchingPair(char opening, char closing) {
        return (opening == '(' && closing == ')')
                || (opening == '[' && closing == ']')
                || (opening == '{' && closing == '}');
    }
}
