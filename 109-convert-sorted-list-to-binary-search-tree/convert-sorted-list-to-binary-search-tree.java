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
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> arr = new ArrayList<>();//create a new arrayList
        while(head != null){//while the head is not null.
            arr.add(head.val);//add every node to th array list
            head = head.next;//iterate through it O(n).
        }

        return build(arr, 0, arr.size() - 1);//use the helper build function.
    }

    TreeNode build(List<Integer> l, int left, int right){//args is a list, left and right ints.
        if(left > right) return null;//if left is greater than right then return null.
        int mid = left + (right - left) / 2;//get the mid point.

        TreeNode root = new TreeNode(l.get(mid));//set the treenode root to mid.
        root.left = build(l, left, mid - 1);//do the same for left recurrsively.
        root.right = build(l, mid + 1, right);//do the same for right recurrsively.
        return root;//return the root.
    }
}