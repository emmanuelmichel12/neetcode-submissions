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
    public int pairSum(ListNode head) {

        if(head == null)
        {
            return 0;
        }

        int finalSum = 0;

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode next = slow;
        ListNode current = slow;

        while(current != null)
        {
            next = next.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        ListNode sum1 = head;
        ListNode sum2 = prev;

        while(sum2 != null)
        {
            if((sum1.val + sum2.val) > finalSum)
            {
                finalSum = sum1.val + sum2.val;
            }

            sum1 = sum1.next;
            sum2 = sum2.next;
        }

        return finalSum;
        
    }
}