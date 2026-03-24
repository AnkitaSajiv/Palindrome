import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Create Stack and Queue
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        // Add characters to both
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));   // LIFO
            queue.add(word.charAt(i));    // FIFO
        }

        boolean isPalindrome = true;

        // Compare stack pop and queue dequeue
        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome");
        } else {
            System.out.println(word + " is NOT a Palindrome");
        }
    }
}