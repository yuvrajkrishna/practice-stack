public class two {
    public static void main(String[] args) {
        String str = "Hello";
        char stack [] = new char [5];
        int top = -1;
        for(int i = 0; i < str.length(); i++){
            top = push(stack, top, str.charAt(i));
        }
        for(int i = top; i >= 0 ; i--){
            System.out.print(stack[i]);
        }
    }
    public static int push (char stack [] , int top , char val){
        if(top == stack.length-1){
            System.out.println("Stack is overflow");
            return top;
        }
        top++;
        stack[top] = val;
        return top;
    }
    public static int pop (char stack [] , int top){
        if(top == -1){
            System.out.println("Nothing To Remove");
        }
        System.out.println("Removed :"+stack[top]);
        top--;
        return top;
    }
    public static int peek (char stack [] , int top){
        System.out.println("Top Elem is : "+stack[top]);
        return stack[top];
    }
    public static boolean isEmpty (int top){
        if(top == -1){
            return true;
        }
        return false;
    }
    public static int size (int top){
        if(top == -1){
            System.out.println("Stack is Empty");
            return top;
        }
        System.out.println("size is : "+(top+1));
        return top;
    }
}
