//19. Remove Nth Node From End of List
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count = 1;
        ListNode i = head;
        while (i.next != null) {
            i = i.next;
            count++;
        }
        if (count == n) {
            return head.next;
        }
        n = count - n;
        i = head;
        count = 1;

        while (i.next != null) {

            if (count == n ) {
                i.next = i.next.next;
                break;
            }
            i = i.next;
            count++;

        }
        return head;
    }
}
