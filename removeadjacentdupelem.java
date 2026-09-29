import java.util.Stack;

public class removeadjacentdupelem {
    public static void main(String[] args) {
        String str = "abbaca";
        Stack<Character> stack = new Stack<>();
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                if(stack.peek() == ch){
                    stack.pop();
                }
                else{
                    stack.push(ch);
                }
            }
        }
        System.out.println(stack);
    }
}
