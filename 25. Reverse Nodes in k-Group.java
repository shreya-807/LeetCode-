//25. Reverse Nodes in k-Group
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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode start = head;
        ArrayList<Integer> list = new ArrayList<>();
        while (start != null) {
            list.add(start.val);
            start = start.next;
        }
        int p = 0;
        int q = k - 1;

        while (q < list.size()) {
            int i = p;
            int j = q;
            while (i < j) {
                Integer temp = list.get(i);
                list.set(i, list.get(j));
                list.set(j, temp);

                i++;
                j--;
            }

            p += k;
            q += k;
        }
        int i = 0;
        start = head;
        while (i < list.size()) {
            start.val = list.get(i);
            i++;
            start = start.next;
        }
        return head;

    }
}
