import java.util.Arrays;

public class TwoStack {

    static int arr[] = new int[10];

    static int top1 = -1;
    static int top2 = arr.length;

    public static void push1(int value) {

        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top1] = value;
    }

    public static void push2(int value) {

        if (top1 + 1 == top2) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[--top2] = value;
    }

    public static int pop1() {

        if (top1 == -1) {
            System.out.println("Stack 1 Underflow");
            return -1;
        }

        return arr[top1--];
    }

    public static int pop2() {

        if (top2 == arr.length) {
            System.out.println("Stack 2 Underflow");
            return -1;
        }

        return arr[top2++];
    }

    public static void main(String[] args) {

        push1(10);
        push1(20);
        push1(30);

        push2(100);
        push2(200);
        push2(300);
        push2(400);
        push2(500);
        push2(600);
        push2(700);
        push2(800);
        // System.out.println(pop1());
        // System.out.println(pop2());
        System.out.println(Arrays.toString(arr));
    }
}