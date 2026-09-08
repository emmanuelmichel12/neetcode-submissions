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
    public ListNode rotateRight(ListNode head, int k) {
        
        if(head == null)
        {
            return null;
        }


        ListNode move = head;
        ListNode move2 = head;
        ListNode newHead = head;
        ListNode length = head;
        int count = 0;

        while(length != null)
        {
            length = length.next;
            count++;
        }

        k = k % count;
        if(k == 0)
        {
            return head;
        }
        int track = count - k - 1;
/*
        if(k > count)
        {
            track = k % count;
        }
*/
        while(move != null && track != 0)
        {
            move = move.next;
            track--;
        }

        newHead = move.next;

        while(move2.next != null)
        {
            move2 = move2.next;
        }

        move2.next = head;
        move.next = null;

        return newHead;



    }
}