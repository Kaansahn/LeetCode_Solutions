/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     public int val;
 *     public ListNode next;
 *     public ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode GetIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        ListNode currentA = headA;
        ListNode currentB = headB;

        while(currentA != null || currentB != null)
        {
            if(currentA != null)
            {
                if(set.Contains(currentA)) return currentA;
                set.Add(currentA);
                currentA = currentA.next;
            }

            if(currentB != null)
            {
                if(set.Contains(currentB)) return currentB;
                set.Add(currentB);
                currentB = currentB.next;
            }
        }
        
        return null;
    }
}