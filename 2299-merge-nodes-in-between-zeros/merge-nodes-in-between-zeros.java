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
        ListNode current = head.next;   
        ListNode merge = head;          
        int sum = 0;

        while (current != null) {
            if (current.val != 0) {
                sum += current.val;
            } else {
                merge.val = sum;
                merge.next = current.next;
                merge = merge.next;
                sum = 0;
            }
            current = current.next;
        }
        return head;
    }
}