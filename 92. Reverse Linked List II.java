//92. Reverse Linked List II
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode start = head;
        while (start != null) {
            list.add(start.val);
            start = start.next;
        }
        left--;
        right--;
        while (left <= right) {
            Collections.swap(list, left, right);
            right--;
            left++;
        }
        start = head;
        int i = 0;
        while (start != null && i < list.size()) {
            start.val = list.get(i);
            start = start.next;
            i++;
        }
        return head;

    }
}
