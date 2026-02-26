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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;   // ⭐ important fix

        ListNode h1 = head;
        ListNode h2 = head.next;

        while (h2 != null) {
            if (h1.val == h2.val) {
                h2 = h2.next;           // skip duplicate
            } else {
                h1.next = h2;           // link unique node
                h1 = h2;
                h2 = h2.next;
            }
        }

        h1.next = null;               
        return head;
    }
}