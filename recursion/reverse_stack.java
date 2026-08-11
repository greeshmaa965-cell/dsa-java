import java.util.*;

class Solution {

    public static void reverseStack(Stack<Integer> stack) {

        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Reverse remaining stack
        reverseStack(stack);

        // Insert removed element at bottom
        insertAtBottom(stack, top);
    }

    public static void insertAtBottom(Stack<Integer> stack, int element) {

        // If stack is empty, insert element
        if (stack.isEmpty()) {
            stack.push(element);
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Recursively insert element at bottom
        insertAtBottom(stack, element);

        // Put removed element back
        stack.push(top);
    }
}
