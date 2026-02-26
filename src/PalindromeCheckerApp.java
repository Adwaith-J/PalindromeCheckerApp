/*UC1
 * @author developer
 * @version 1.0
 */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "refer";
        Deque<Character> deque = new LinkedList<>();
        for (char ch : input.toCharArray()) {
            deque.add(ch);
        }
        boolean isEqual = deque.peekFirst().equals(deque.peekLast());
        System.out.println(isEqual);
    }
}



