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
        if(head == null)
        {
            return null;
        }

        ListNode track = head;
        int nodeCount = 0;
        while(track != null)
        {
            track = track.next;
            nodeCount++;
        }

        ListNode slow = head;
        ListNode fast = head.next;
        int remove = nodeCount - n;
        ListNode temp = head;

        if(remove == 0)
        {
            return head.next;
        }

        while(fast != null && remove != 0)
        {
            slow = slow.next;
            fast = fast.next;
            remove--;
        }

        while(temp.next != slow)
        {
            temp = temp.next;
        }

        temp.next = fast;

        return head;
    }
}
