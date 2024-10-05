import oct05.stack.ArrayImplementation;
import oct05.stack.LinkedListImplementation;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stak = new Stack<>();
        ArrayImplementation stack = new ArrayImplementation(5);
        LinkedListImplementation stk = new LinkedListImplementation();
        stk.push(2);
        stk.push(4);
        stk.push(7);
        stk.pop();
        stk.peek();
        boolean check = stk.isEmpty();

    }
}