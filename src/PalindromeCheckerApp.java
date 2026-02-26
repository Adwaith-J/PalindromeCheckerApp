/*UC1
 * @author developer
 * @version 1.0
 */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "madam";

        class Palindrome {
            boolean isPalindrome(String s, int left, int right) {
                if (left >= right) return true; // base case
                if (s.charAt(left) != s.charAt(right)) return false;
                return isPalindrome(s, left + 1, right - 1);
            }
        }

        Palindrome checker = new Palindrome();
        boolean result = checker.isPalindrome(input, 0, input.length() - 1);

        System.out.println(result);
    }
}
