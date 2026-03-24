public class UseCase10PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {

        // Normalize string: remove spaces & convert to lowercase
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        // Two-pointer check
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "Madam In Eden Im Adam";

        if (isPalindrome(input)) {
            System.out.println("\"" + input + "\" is a Palindrome");
        } else {
            System.out.println("\"" + input + "\" is NOT a Palindrome");
        }
    }
}