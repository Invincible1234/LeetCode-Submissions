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
    public boolean isValidBST(TreeNode root) {
        return validate(root, null, null);//helper function for the root.
    }

    public boolean validate(TreeNode node, Integer minval, Integer maxval){
        if(node == null) return true;//if the root is null, return true.

        //check if the minval and maxval conditions aren't  true.
        if((minval != null && node.val <= minval) || maxval != null && node.val >= maxval){
            return false;//if so return false.
        }

        //do the same recurrsively for node.left and node.right
        return validate(node.left, minval, node.val) && validate(node.right, node.val, maxval);
    }
}