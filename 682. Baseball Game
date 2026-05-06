//682. Baseball Game

class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < op.length; i++) {
            if (!op[i].equals("+") && !op[i].equals("C") && !op[i].equals("D")) {
                stack.push(Integer.parseInt(op[i]));
            } else if (op[i].equals("C")) {
                stack.pop();
            } else if (op[i].equals("D")) {
                stack.push(stack.peek() * 2);
            } else { 
                int last = stack.pop();
                int newTop = stack.peek() + last;
                stack.push(last);       
                stack.push(newTop);     
            }
        }
        
        int sum = 0;
        for (int score : stack) {
            sum += score;
        }
        return sum;
    }
}
