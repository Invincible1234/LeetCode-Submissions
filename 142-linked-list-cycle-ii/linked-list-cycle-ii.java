/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow =  head;//slow pointer.
        ListNode fast = head;//fast pointer.
        do{//do the following.
            if(fast == null || fast.next == null){//if fast or fast.next is null.
                return null;//return null.
            }
            slow = slow.next;//move the slow pointer forwards.
            fast = fast.next.next;//move the fast pointer forwards + 2.
        }while(slow != fast);// while fast does not equal to slow.

        slow = head;//reset the slow pointer back to the head.

        while(slow != fast){//check if the slow pointer equals to fast pointer.
            slow = slow.next;//if not move the slow pointer forward by 1.
            fast = fast.next;//if not move the fast pointer forward by 1.
        }

        return slow;//return the slow pointer.
    }
}