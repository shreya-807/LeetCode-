import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        // If the length is odd, it can't be valid
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push expected matching closing bracket onto the stack
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // If stack is empty or doesn't match the expected closing bracket
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }

        // Valid if all brackets have been matched and popped
        return stack.isEmpty();
    }
}