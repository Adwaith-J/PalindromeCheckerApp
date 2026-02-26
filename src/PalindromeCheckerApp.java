/*UC1
 * @author developer
 * @version 1.0
 */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        String choice = "recursive";

        boolean result;
        if (choice.equals("recursive")) {
            RecursivePalindrome checker = new RecursivePalindrome();
            result = checker.isPalindrome(input, 0, input.length() - 1);
        } else {
            IterativePalindrome checker = new IterativePalindrome();
            result = checker.isPalindrome(input);
        }

        System.out.println(result);
    }

    static class RecursivePalindrome {
        boolean isPalindrome(String s, int left, int right) {
            if (left >= right) return true;
            if (s.charAt(left) != s.charAt(right)) return false;
            return isPalindrome(s, left + 1, right - 1);
        }
    }
    static class IterativePalindrome {
        boolean isPalindrome(String s) {
            int left = 0, right = s.length() - 1;
            while (left < right) {
                if (s.charAt(left) != s.charAt(right)) return false;
                left++;
                right--;
            }
            return true;
        }
    }
}

