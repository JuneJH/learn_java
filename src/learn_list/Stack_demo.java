package learn_list;

import java.util.Stack;

public class Stack_demo {
    public static void main(String[] args) {
        Stack<String> stack = new Stack();

        stack.push("a");
        stack.push("b");

        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack);
    }
}
