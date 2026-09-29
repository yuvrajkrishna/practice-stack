import java.util.Stack;

public class postfixtoinfix {

    public static boolean operator(char ch) {
        if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        String str = "ab+cd*-";

        Stack<String> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isAlphabetic(ch)) {
                stack.push(String.valueOf(ch));
            }

            else if (operator(ch)) {

                String operand2 = stack.pop();
                String operand1 = stack.pop();

                String ans = "(" + operand1 + ch + operand2 + ")";

                stack.push(ans);
            }
        }

        System.out.println(stack.pop());
    }
}