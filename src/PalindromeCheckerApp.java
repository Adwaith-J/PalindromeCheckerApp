/*UC1
 * @author developer
 * @version 1.0
 */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "civic";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray()) {
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;
        while (!queue.isEmpty()) {
            char fromQueue = queue.remove();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println( isPalindrome);
    }
}


