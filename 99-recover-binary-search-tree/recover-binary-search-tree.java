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
    TreeNode first, second, prev;
    public void recoverTree(TreeNode root) {
        first = second = prev = null;
        scan(root);
        int t = first.val;
        first.val = second.val;
        second.val = t;

    }

    void scan(TreeNode x){
        if(x == null) return;
        scan(x.left);
        if(prev!=null&&prev.val>x.val){
            if(first==null)first=prev;second=x;
        }
		prev=x;	scan(x.right);
    }
}