//2807. Insert Greatest Common Divisors in Linked List
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
    public int gcd(int a, int b) {
        int n = 1;
        int gc = 1;
        while (n <= Math.max(a, b)) {
            if (a % n == 0 && b % n == 0) {
                gc = n;
                n++;
            } else
                n++;
        }
        return gc;
    }

    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode start = head;
        if (start == null || start.next == null) {
            return head;
        }
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> gcdl = new ArrayList<>();
        start = head;
        while (start != null) {
            list.add(start.val);
            start = start.next;
        }
        start = head;
        for (int i = 0; i < list.size() - 1; i++) {
            gcdl.add(gcd(list.get(i), list.get(i + 1)));
        }
        ArrayList<Integer> fin = new ArrayList<>();
        int i = 0;
        int j = 0;
        while (i < list.size() || j < gcdl.size()) {
            if (i < list.size()) {
                fin.add(list.get(i));
                i++;
            }
            if (j < gcdl.size()) {
                fin.add(gcdl.get(j));
                j++;
            }
        }
        i = 0;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for ( i = 0; i < fin.size(); i++) {
            current.next = new ListNode(fin.get(i));
            current = current.next;
        }
        return dummy.next;
        
    }
}
