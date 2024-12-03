package LastGroupAssignmentGroup;

import java.util.*;

public class SplitStack {
    // Method to split the stack into negatives at the bottom and non-negatives at the top
    public static void splitStack(Stack<Integer> stack) {
        Queue<Integer> queue = new LinkedList<>();

        // Move all elements from stack to queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }

        // Push negatives back into the stack
        for (int num : queue) {
            if (num < 0) {
                stack.push(num);
            }
        }

        // Push non-negatives back into the stack
        for (int num : queue) {
            if (num >= 0) {
                stack.push(num);
            }
        }
    }

    // Helper method to display the contents of a stack
    public static void displayStack(Stack<Integer> stack) {
        System.out.println("Stack contents: " + stack);
    }

    // Main method to test the splitStack method
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.addAll(Arrays.asList(5, -5, 67, -45, 67, 9, 0, -42, 56, -7));

        System.out.println("Before splitStack:");
        displayStack(stack1);

        splitStack(stack1);

        System.out.println("After splitStack:");
        displayStack(stack1);

        Stack<Integer> stack2 = new Stack<>();
        stack2.addAll(Arrays.asList(1, -2, -3, 4, -5, 6, -7, 8, 9));

        System.out.println("\nBefore splitStack:");
        displayStack(stack2);

        splitStack(stack2);

        System.out.println("After splitStack:");
        displayStack(stack2);
    }
}
