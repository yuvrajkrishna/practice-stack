import java.util.Stack;

public class checkforparentheses{
    public static void main(String[] args) {
        String str = "{[])}";
        Stack<Character> stack = new Stack<>();
        for(int i= 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '[' || ch == '(' || ch == '{'){
                stack.push(ch);
            }
            else if(ch == ']' || ch == ')' || ch == '}'){
                if(stack.isEmpty()){
                    System.out.println("Not Balanced");
                    return;
                }
                else{
                    if((ch == ']' && stack.peek() == '[') || (ch == ')' && stack.peek() == '(') || (ch == '}' && stack.peek() == '{')){
                        stack.pop();
                    }
                    else{
                        System.out.println("Not Balanced");
                        return;
                    }
                }
            }
        }
        if(stack.isEmpty()){
            System.out.println("Balanced");
            return;
        }
        
    }
}