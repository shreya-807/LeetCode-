//21. Merge Two Sorted Lists
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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int i = 0;
        int j = 0;
        ListNode start1 = list1;
        ListNode start2 = list2;
        ListNode newnode = new ListNode();
        ListNode current = newnode;
        while (start1 != null && start2 != null) {
            if (start1.val <= start2.val) {
                current.next = new ListNode(start1.val);
                start1 = start1.next;
            } else {
                current.next = new ListNode(start2.val);
                start2 = start2.next;
            }
            current = current.next;
        }
        if (start1 != null) {
            current.next = start1;
        } else {
            current.next = start2;
        }
        return newnode.next;
    }
}
