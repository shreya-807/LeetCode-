//2130. Maximum Twin Sum of a Linked List
class Solution {
    public int pairSum(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode curr = head;
        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }
        
        int maxTwinSum = 0;
        int n = list.size();
        
        int i = 0;
        int j = n - 1;
        
        while (i < j) {
            int currentTwinSum = list.get(i) + list.get(j);
             if (currentTwinSum > maxTwinSum) {
                maxTwinSum = currentTwinSum;
            }
            
            i++;
            j--;
        }
        
        return maxTwinSum;
    }
}
