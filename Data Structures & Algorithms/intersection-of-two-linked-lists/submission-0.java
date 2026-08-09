/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if(headA == null || headB == null)
        {
            return null;
        }

        int countA = 0;
        int countB = 0;
        ListNode tempA = headA;
        ListNode tempB = headB;

        while(tempA != null)
        {
            countA++;
            tempA = tempA.next;

        }

        while(tempB != null)
        {
            countB++;
            tempB = tempB.next;

        }

        ListNode longList = null;
        ListNode shortList = null;

        if(countA > countB)
        {
            longList = headA;
            shortList = headB;
        }
        else
        {
            longList = headB;
            shortList = headA;
        }

        int diff = Math.abs(countA - countB);

        while( longList != null && diff != 0)
        {
            longList = longList.next;
            diff--;
        }

        while(longList != null && shortList != null)
        {
            if(longList == shortList)
            {
                return longList;
            }
            else
            {
                longList = longList.next;
                shortList = shortList.next;
            }
        }

        return null;
        
    }
}