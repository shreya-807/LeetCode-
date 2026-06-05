//24. Swap Nodes in Pairs
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
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode start = head;
        ListNode end = head.next;
        int value = 0;
        while (end != null) {
            value = start.val;
            start.val = end.val;
            end.val = value;
            if (end.next == null || end.next.next == null) {
                break;
            }
            start = start.next.next;
            end = end.next.next;
        }
        return head;
    }
}
