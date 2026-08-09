import java.util.*;

class Solution {

    public static void sortStack(Stack<Integer> stack) {

        // Base case
        if (stack.isEmpty()) {
            return;
        }

        // Remove top element
        int top = stack.pop();

        // Sort remaining stack
        sortStack(stack);

        // Insert removed element at correct position
        insert(stack, top);
    }

    public static void insert(Stack<Integer> stack, int element) {

        // If stack is empty OR top is smaller than element
        if (stack.isEmpty() || stack.peek() < element) {
            stack.push(element);
            return;
        }

        // Remove top
        int top = stack.pop();

        // Recursively find correct position
        insert(stack, element);

        // Put removed element back
        stack.push(top);
    }
}
