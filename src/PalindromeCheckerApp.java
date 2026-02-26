/*UC1
 * @author developer
 * @version 1.0
 */

public class PalindromeCheckerApp {
        public static void main(String[] args) {
            String input = "noon";

            // Step 1: Push characters onto stack
            Stack<Character> stack = new Stack<>();
            for (char ch : input.toCharArray()) {
                stack.push(ch);
            }

            // Step 2: Pop characters to build reversed string
            StringBuilder reversed = new StringBuilder();
            while (!stack.isEmpty()) {
                reversed.append(stack.pop());
            }

            // Step 3: Print results
            System.out.println("Original: " + input);
            System.out.println("Reversed: " + reversed);

            if (input.equals(reversed.toString())) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
}

