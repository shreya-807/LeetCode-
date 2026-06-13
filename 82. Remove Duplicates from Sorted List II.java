//82. Remove Duplicates from Sorted List II/**

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode start = head;
        ArrayList<Integer> res = new ArrayList<>();
        while (start != null) {
            res.add(start.val);
            start = start.next;
        }
        int value = 0;

        for (int i = 0; i < res.size() - 1; i++) {
            if (res.get(i).equals(res.get(i + 1))) {
                value = res.get(i);
                for (int j = i; j < res.size(); j++) {
                    if (res.get(j) == value) {
                        res.remove(j);
                        j--;
                    }
                }
                i--;
            }
        }
        if (res.size() == 0)
            return null;
        ListNode curr = head;
        int i = 0;

        while (i < res.size()) {
            curr.val = res.get(i);
            i++;
            if (i == res.size())
                curr.next = null;
            else
                curr = curr.next;

        }

        return head;
    }
}
