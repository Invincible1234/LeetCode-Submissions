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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root == null){//check if the root is null.
            return false;//if so return false.
        }

        if(root.left == null && root.right == null){//checks if left and right are null.
            return targetSum - root.val == 0;//if so return the difference between target sum and parent node and it better be 0.
        }

        targetSum -= root.val;//targetNum - root.val (Recurrsively)

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right,targetSum);
        //do the recurrsion on root.left or root.right to find the path.
    }
}