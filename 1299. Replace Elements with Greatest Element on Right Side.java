//1299. Replace Elements with Greatest Element on Right Side
class Solution {
    public int[] replaceElements(int[] arr) {

        int[] res = new int[arr.length];

        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        res[arr.length - 1] = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = stack.peek();
            if (stack.peek() < arr[i])
                stack.push(arr[i]);

        }
        return res;
    }
}
