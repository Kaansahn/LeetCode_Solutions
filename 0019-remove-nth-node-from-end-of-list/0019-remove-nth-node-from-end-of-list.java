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
        ListNode left = head, right = head.next;
        int i = 1;
        while(right != null){
            right = right.next;
            if(i > n) left = left.next;
            i++;
        }

        if(i == n) return head.next;

        left.next = left.next.next;

        return head;
    }
}