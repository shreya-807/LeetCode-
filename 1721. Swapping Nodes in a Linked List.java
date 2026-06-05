//1721. Swapping Nodes in a Linked List
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
    public ListNode swapNodes(ListNode head, int k) {
        int value = 0;
        int n = k;
        int count = 1;
        ListNode start = head;
        ListNode update = head;
        while (start!= null) {
           
            if (count == k) {
                value = start.val;
                update = start;
                break;
            } count++;
            start=start.next;
        }

        start = head;
        count = 1;
        while (start != null) {
            count++;
            start = start.next;
        }
        start = head;
        n = count - k ;
        count=1;
        while (start != null) {

            if (count == n) {
                update.val = start.val;
                start.val = value;
                break;
            }
            count++;
            start = start.next;
        }

        return head;
    }
}
