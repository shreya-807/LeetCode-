//143. Reorder List
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode start = head;
        int count = 0;
        while (start != null) {
            list.add(start.val);
            start = start.next;
        }
        start = head;
        int i = 0;
        int j = list.size() - 1;

        while (i <= j) {
            if (i == j) {
                start.val = list.get(i);
                break; 
            }
            start.val = list.get(i);
            i++;
            start = start.next;
            start.val = list.get(j);
            j--;
            start = start.next;
        }

    }
}
