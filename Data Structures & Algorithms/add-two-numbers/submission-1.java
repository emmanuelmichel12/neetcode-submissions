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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int nodeVal = 0;
        ListNode solution = null;
        ListNode current = null;

        while(l1 != null && l2 != null)
        {

            int val = l1.val + l2.val + carry;
            if(val > 9)
            {
                nodeVal = val % 10;
                carry = val / 10;
            }
            else
            {
                carry = 0;
                nodeVal = val;
            }

            ListNode newNode = new ListNode(nodeVal);
            if(solution == null)
            {
                solution = newNode;
                current = newNode;
                current.next = null;
            }
            else
            {
                current.next = newNode;
                current = current.next;
            }

            l1 = l1.next;
            l2 = l2.next;
        }

        if(l1 != null)
        {
            while(l1 != null)
            {
                int val2 = carry + l1.val;
            if(val2 > 9)
            {
                nodeVal = val2 % 10;
                carry = val2 / 10;
            }
            else
            {
                carry = 0;
                nodeVal = val2;
            }

            ListNode newNode = new ListNode(nodeVal);
            current.next = newNode;
            current = current.next;
            l1 = l1.next;
            }
        }
        else
        {
            while(l2 != null)
            {
                int val2 = carry + l2.val;
            if(val2 > 9)
            {
                nodeVal = val2 % 10;
                carry = val2 / 10;
            }
            else
            {
                carry = 0;
                nodeVal = val2;
            }

            ListNode newNode = new ListNode(nodeVal);
            current.next = newNode;
            current = current.next;
            l2 = l2.next;
            }
        }

        if(carry > 0)
        {
            ListNode newNode = new ListNode(carry);
            current.next = newNode;
            current = current.next;
        }
        
        return solution;
    }
}
