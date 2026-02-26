/*UC1
 * @author developer
 * @version 1.0
 */

public class PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "radar";
            boolean isPalindrome = checkPalindrome(input);
            System.out.println(isPalindrome);
        }

        public static boolean checkPalindrome(String input) {
            char[] chars = input.toCharArray();
            int start = 0;
            int end = chars.length - 1;

            while (start < end) {
                if (chars[start] != chars[end]) {
                    return false;
                }
                start++;
                end--;
            }
            return true;
        }
    }

