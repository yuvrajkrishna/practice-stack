public class getminbyn {

    static int min;

    public static void main(String[] args) {

        int stack[] = new int[5];
        int top = -1;

        top = push(stack, top, 10);
        top = push(stack, top, 20);
        top = push(stack, top, 5);
        top = push(stack, top, 40);
        top = push(stack, top, -6);

        System.out.println("Minimum : " + getMin(stack, top));

        top = pop(stack, top);
        System.out.println("Minimum : " + getMin(stack, top));

        top = pop(stack, top);
        System.out.println("Minimum : " + getMin(stack, top));
    }

    public static int push(int stack[], int top, int val) {

        if (top == stack.length - 1) {
            System.out.println("Stack is overflow");
            return top;
        }

        if (top == -1) {
            top++;
            stack[top] = val;
            min = val;
        }

        else if (val < min) {
            top++;
            stack[top] = 2 * val - min;
            min = val;
        }

        else {
            top++;
            stack[top] = val;
        }

        return top;
    }

    public static int pop(int stack[], int top) {

        if (top == -1) {
            System.out.println("Nothing To Remove");
            return top;
        }

        int value = stack[top];

        if (value < min) {
            min = 2 * min - value;
        }

        top--;

        return top;
    }

    public static int getMin(int stack[], int top) {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        return min;
    }

    public static int peek(int stack[], int top) {

        if (top == -1) {
            System.out.println("Stack is Empty");
            return -1;
        }

        if (stack[top] < min) {
            return min;
        }

        return stack[top];
    }

    public static boolean isEmpty(int top) {
        return top == -1;
    }

    public static int size(int top) {
        return top + 1;
    }
}