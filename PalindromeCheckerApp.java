/*UC1
* @author developer
* @version 1.0
 */

public class PalindromeCheckerApp {

    public static void main(String[] args){
        System.out.println("Welcome to Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System Initialized Successfully");
        String text = new String("madam");
        boolean palindrome = true;
        for (int i = 0; i < text.length() / 2; i++) {
            if (text.charAt(i) != text.charAt(text.length() - 1 - i)) {
                palindrome = false;
                break;
            }
        }

        if (palindrome=true) {
            System.out.println("true");
        } else {
            System.out.println(" false");
        }
    }
}
}


