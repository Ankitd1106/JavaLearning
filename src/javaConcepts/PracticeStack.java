package javaConcepts;

import java.util.Stack;

public class PracticeStack {

    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                stack.push(i);
            }
        }

        // Peek at the top element
        System.out.println("Top element: " + stack.peek());

        // Pop the top element
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());

        System.out.println("Top element: " + stack.peek());

        // Check if the stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());

        // Search for an element
        System.out.println("Position of 10: " + stack.search(10));

        System.out.println(stack);


    }
}
