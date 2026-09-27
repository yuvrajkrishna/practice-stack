import java.util.Stack;

public class deletemiddleelem {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println(stack);
        DeleteMidElement(stack);
    }
    public static void DeleteMidElement (Stack<Integer> stack){
        int mid = stack.size()/2;
        Stack<Integer> sec = new Stack<>();
        for(int i = stack.size()-1; i > mid; i--){
            sec.push(stack.pop());
        }
        stack.pop();
        for(int i = stack.size()-1; i >= 0; i--){
            stack.push(sec.pop());
        }
        System.out.println(stack);
    }
}
