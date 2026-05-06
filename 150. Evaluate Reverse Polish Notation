//150. Evaluate Reverse Polish Notation
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!tokens[i].equals("+") && !tokens[i].equals("-") && !tokens[i].equals("*") && !tokens[i].equals("/")) {
                stack.push(Integer.parseInt(tokens[i]));
            } else if (tokens[i].equals("+")) {
                int last = stack.pop();
                int newTop = stack.pop() + last;

                stack.push(newTop);
            } else if (tokens[i].equals("-")) {
                int last = stack.pop();
                int newTop = stack.pop() - last;

                stack.push(newTop);
            } else if (tokens[i].equals("*")) {
                int last = stack.pop();
                int newTop = stack.pop() * last;

                stack.push(newTop);
            } else if (tokens[i].equals("/")) {
                int last = stack.pop();
                int newTop = stack.pop() / last;

                stack.push(newTop);
            }
        }
        return stack.peek();
    }
}
