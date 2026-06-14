//148. Sort List
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
    public ListNode sortList(ListNode head) {
        ArrayList<Integer> res = new ArrayList<>();
        ListNode start = head;
        while (start != null) {
            res.add(start.val);
            start = start.next;
        }
        Collections.sort(res);
        start = head;
        int i = 0;
        while (i < res.size()) {
            start.val = res.get(i);
            i++;
            start = start.next;
        }
        return head;

    }
}
