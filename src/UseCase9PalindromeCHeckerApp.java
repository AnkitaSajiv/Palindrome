public class UseCase9PalindromeCheckerApp {

    // Recursive method
    public static boolean isPalindrome(String str, int left, int right) {

        // Base condition
        if (left >= right) {
            return true;
        }

        // If characters don't match
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }

        // Recursive call
        return isPalindrome(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        String word = "madam";

        // Call recursive function
        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}