public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Convert to char array
        char[] arr = word.toCharArray();

        int left = 0;
        int right = arr.length - 1;
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (left < right) {
            if (arr[left] != arr[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}