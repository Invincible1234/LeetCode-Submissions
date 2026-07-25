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
        ListNode a = headA;//a pointer for a list
        ListNode b = headB;//a point for b list.

        while(a != b){//traverse until both nodes are equal
            a = a != null ? a.next : headB; //after traversal, redirect to the head of other list.
            b = b != null ? b.next : headA; //again do the same thing as before, after done with the traversal, redirect to the head of the other list.
        }
        return a;//the loop will end, once both of the node pointers are the same that is a and b and that it will return pointer a and forwards.
    }
}