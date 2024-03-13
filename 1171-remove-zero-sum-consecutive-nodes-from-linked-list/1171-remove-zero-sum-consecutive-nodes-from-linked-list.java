/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0), current = head;
        dummy.next = head;

        int sum = 0;

        Map<Integer, ListNode> map = new HashMap<>();
        map.put(0, dummy);

        while(current != null){
            sum += current.val;
            if(map.containsKey(sum)){
                ListNode oldNodeWithSameSum = map.get(sum);
                ListNode toBeRemovedNode = oldNodeWithSameSum.next;

                int tempSum = sum;

                while(toBeRemovedNode != current){
                    tempSum += toBeRemovedNode.val;
                    map.remove(tempSum);
                    toBeRemovedNode = toBeRemovedNode.next;
                }
                oldNodeWithSameSum.next = current.next;

            }else map.put(sum, current);

            current = current.next;
        }

        return dummy.next;
    }

}