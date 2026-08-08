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
    public boolean isPalindrome(ListNode head) {
        if(head == null)
        {
            return true;
        }

        Stack<Integer> stack = new Stack<>();

        ListNode fast = head.next;
        ListNode slow = head;

        while(fast != null && fast.next != null)
        {
            stack.push(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }

        //stack.push(slow.val);
        //slow = slow.next;

        if(fast != null)
        {
            stack.push(slow.val);
            slow = slow.next;
        }
        else
        {
            slow = slow.next;
        }

        while(slow != null)
        {
            if(stack.peek() != slow.val)
            {
                return false;
            }
            else
            {
                stack.pop();
            }

            slow = slow.next;
        }

        if(stack.size() > 0)
        {
            return false;
        }

        return true;
    }
}