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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }

        //MergeSort Approach.
        return mergeList(lists, 0, lists.length - 1); //merge the list with the start and end.
    }

    public ListNode mergeList(ListNode[] lists, int start, int end){
        if(start == end){//if the end and the start are same then just return the lists[start].
            return lists[start];
        }
        if(start + 1 == end){//merge the lists if by +1.
            return merge(lists[start], lists[end]);
        }

        int mid = start + (end - start) / 2;//find the mid.
        ListNode left = mergeList(lists, start, mid);//left side.
        ListNode right = mergeList(lists, mid + 1, end);//right side.

        return merge(left, right);//merge.
    }

    public ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);//dummy node
        ListNode curr = dummy;//curr points to dummy

        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                curr.next = l1;
                l1 = l1.next;
            }
            else{
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if(l1 != null){
            curr.next = l1;
        }
        else{
            curr.next = l2;
        }

        return dummy.next;
    }
}