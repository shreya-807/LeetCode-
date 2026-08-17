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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode start = head;

        while (start != null) {
            list.add(start.val);
            start = start.next;
        }
        start = head;
        ArrayList<Integer> pre = new ArrayList<>();
        int pos = 0;
      

        ArrayList<Integer> post = new ArrayList<>();
        for (int i = pos; i < list.size(); i++) {
            if (list.get(i) < x) {
                pre.add(list.get(i));
            } else {
                post.add(list.get(i));
            }
        }
        
        int i = 0;
        int j = 0;
        while (i < pre.size() && start != null) {
            start.val = pre.get(i);
            i++;
            start = start.next;
        }
        while (j < post.size() && start != null) {
            start.val = post.get(j);
            j++;
            start = start.next;
        }
        return head;
    }
}