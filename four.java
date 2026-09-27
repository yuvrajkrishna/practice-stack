import java.util.Stack;

public class four {
    public static void main(String[] args) {
        String str = "hello";
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i< str.length(); i++){
            stack.push(str.charAt(i));
        }
        for(int i = stack.size()-1; i >= 0 ; i--){
            System.out.print(stack.get(i));
        }
    }
}
