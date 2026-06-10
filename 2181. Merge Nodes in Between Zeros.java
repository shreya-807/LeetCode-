//2181. Merge Nodes in Between Zeros
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
    public ListNode mergeNodes(ListNode head) {
        ArrayList<Integer> nodes = new ArrayList<>();
        while (head != null) {
            nodes.add(head.val);
            head = head.next;
        }
        ArrayList<Integer> result = new ArrayList<>();
        int sum = 0;
        int i = 1;

        while (i < nodes.size()) {
            if (nodes.get(i) != 0) {
                sum = sum + nodes.get(i);
                i++;
            } else if (nodes.get(i) == 0) {
                result.add(sum);
                i++;
                sum=0;              
            }
        }
         ListNode newHead = new ListNode(result.get(0));
        ListNode current = newHead;

        for ( i = 1; i < result.size(); i++) {
            current.next = new ListNode(result.get(i));
            current = current.next;
        }

        return newHead;

    }
}
