/*UC1
 * @author developer
 * @version 1.0
 */
import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String input = "level";

        long startTime = System.nanoTime();
        boolean result = isPalindrome(input, 0, input.length() - 1);
        long endTime = System.nanoTime();

        System.out.println("IsPalindrome: " + result);
        System.out.println("Time taken: " + (endTime - startTime) + " ns");
    }

    static boolean isPalindrome(String s, int left, int right) {
        if (left >= right) return true; // base case
        if (s.charAt(left) != s.charAt(right)) return false;
        return isPalindrome(s, left + 1, right - 1);
    }
}

