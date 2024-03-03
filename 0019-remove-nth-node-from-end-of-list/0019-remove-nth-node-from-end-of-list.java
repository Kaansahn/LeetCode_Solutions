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
        Stack<ListNode> s = new Stack<>();
        ListNode curr = head;
        int size = 0;

        while(curr != null){
            s.push(curr);
            curr = curr.next;
            size++;
        }

        if(size == n) return head.next;

        while(n >= 0 && !s.isEmpty()){
            curr = s.pop();
            n--;
        }

        curr.next = curr.next.next;

        return head;
    }
}