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
    public ListNode reverseBetween(ListNode head, int left, int right) {

        if(head == null)
        {
            return null;
        }

        if(left == right)
        {
            return head;
        }

        int count = 0;
        ListNode countNode = head;

        while(countNode != null)
        {
            countNode = countNode.next;
            count++;
        }

        if(count < right)
        {
            return head;
        }

        ListNode leftNode = head;
        ListNode before = null;

        while(leftNode != null && left > 1)
        {
            left--;
            before = leftNode;
            leftNode = leftNode.next;
        }

        ListNode rightNode = head;

        while(rightNode != null && right > 1)
        {
            right--;
            rightNode = rightNode.next;
        }

        ListNode stop = rightNode.next;

        ListNode prev = null;
        ListNode curr = leftNode;
        ListNode next = leftNode;
        ListNode connect = leftNode;

        while(curr != stop)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        if(before == null)
        {
            head = prev;
            leftNode.next = stop;
            
        }
        else
        {
            before.next = prev;
            leftNode.next = stop;
        }
        return head;
        
    }
}