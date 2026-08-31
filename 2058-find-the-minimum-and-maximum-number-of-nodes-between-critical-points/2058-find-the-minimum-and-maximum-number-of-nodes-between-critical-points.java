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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ArrayList<Integer> min = new ArrayList<>();
        ArrayList<Integer> max = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) > list.get(i) && list.get(i + 1) > list.get(i)) {
                min.add(i);
            }
            if (list.get(i - 1) < list.get(i) && list.get(i + 1) < list.get(i)) {
                min.add(i);
            }
        }
        int i = 0;
        int j = 0;
        int mind = Integer.MAX_VALUE;
        int maxd = -1;
        int[] res = new int[2];
        if (min.size() < 2) {
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        Collections.sort(min);
        maxd = Math.max(maxd, (min.get(min.size() - 1) - min.get(0)));
        for (i = 1; i < min.size(); i++) {
            mind = Math.min(mind, min.get(i) - min.get(i - 1));
        }
        res[0] = mind;
        res[1] = maxd;
        return res;
    }
}