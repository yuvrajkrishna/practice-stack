import java.util.Stack;

public class prefixtoinfix {

    public static boolean operator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "- + a b * c d";

        Stack<String> stack = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            if (ch == ' ') {
                continue;
            }

            if (Character.isAlphabetic(ch)) {
                stack.push(String.valueOf(ch));
            }

            else if (operator(ch)) {

                String operand1 = stack.pop();
                String operand2 = stack.pop();

                String ans = "(" + operand1 + ch + operand2 + ")";

                stack.push(ans);
            }
        }
        // System.out.println(stack);
        System.out.println(stack.pop());
    }
}