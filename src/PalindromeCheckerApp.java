/*UC1
 * @author developer
 * @version 1.0
 */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "A man a plan a canal Panama";

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();

        class Palindrome {
            boolean isPalindrome(String s, int left, int right) {
                if (left >= right) return true; // base case
                if (s.charAt(left) != s.charAt(right)) return false;
                return isPalindrome(s, left + 1, right - 1);
            }
        }

        Palindrome checker = new Palindrome();
        boolean result = checker.isPalindrome(cleaned, 0, cleaned.length() - 1);

        System.out.println(result);
    }
}

