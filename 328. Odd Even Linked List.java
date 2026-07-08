//328. Odd Even Linked List
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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode start = head;
        while (start != null) {
            list.add(start.val);
            start = start.next;
        }
        start = head;
        int i = 0;
        while (head != null && i < list.size()) {
            head.val = list.get(i);
            i += 2;
            head = head.next;
        }
        i = 1;
        while (head != null && i < list.size()) {
            head.val = list.get(i);
            i += 2;
            head = head.next;
        }
        return start;
    }
}
