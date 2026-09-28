import java.util.Stack;

public class getminone {
    static Stack<Integer>min = new Stack<>();
    public static void main(String[] args) {
        int stack [] = new int [5];
        int top = -1;
        top = push(stack, top, 10);
        top = push(stack, top, 20);
        top = push(stack, top, 5);
        top = push(stack, top, 40);
        top = push(stack, top, -6);
        System.out.println(min());
    }
    public static int push(int stack [] , int top , int val){
        if(top == stack.length-1){
            System.out.println("Stack is overflow");
            return top;
        }
        top++;
        stack[top] = val;
        if(min.size() == 0 && top == 0){
            min.push(stack[top]);
        }
        else if(stack[top] < min.peek()){
            min.push(stack[top]);
        }
        return top;
    }
    public static int pop(int stack [] , int top){
        if(top == -1){
            System.out.println("Nothing To Remove");
        }
        System.out.println("Removed :"+stack[top]);
        if(stack[top] == min.peek()){
            min.pop();
        }
        top--;
        return top;
    }
    public static int peek(int stack [] , int top){
        System.out.println("Top Elem is : "+stack[top]);
        return stack[top];
    }
    public static boolean isEmpty(int top){
        if(top == -1){
            return true;
        }
        return false;
    }
    public static int size(int top){
        if(top == -1){
            System.out.println("Stack is Empty");
            return top;
        }
        System.out.println("size is : "+(top+1));
        return top;
    }
    public static int min (){
        return min.peek();
    }
}
