//61. Rotate List
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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) {
            return head;
        }
        int count = 0;
        ListNode start = head;
        ListNode res = head;
        while (start != null) {
            count++;
            start = start.next;
        }
        k = k % count;
        if (k == 0)
            return head;
        start = head;
        ListNode end = head;
        int st = count - k;
        count = 0;
        while (count != st) {
            if (count > 0) {
                end = end.next;
            }

            start = start.next;
            count++;
        }
        while (res.next != null) {
            res = res.next;
        }
        res.next = head;

        end.next = null;
        return start;

    }
}
