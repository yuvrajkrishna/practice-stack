import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {

        String str = "racecar";

        Stack<Character> stack = new Stack<>();

        // First half stack me push
        int mid = str.length() / 2;

        for (int i = 0; i < mid; i++) {
            stack.push(str.charAt(i));
        }

        // Second half ke saath compare
        int start = (str.length() % 2 == 0) ? mid : mid + 1;

        for (int i = start; i < str.length(); i++) {

            if (stack.pop() != str.charAt(i)) {
                System.out.println("Not Palindrome");
                return;
            }
        }

        System.out.println("Palindrome");
    }
}