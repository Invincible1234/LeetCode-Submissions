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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root == null){//check if the root is null.
            root = new TreeNode(val);//if so insert the val into that root.
            return root;//return that root so that it will show the new inserted val.
        }

        if(val < root.val){//check if the val is less than val of the root.
            root.left = insertIntoBST(root.left, val);// if so insert the val recurrsively with root.left.
        }
        else{//check if the val is greater than val of the root.
            root.right = insertIntoBST(root.right, val);//if so insert the val recurrsively with root.right.
        }

        return root;//at last return the root so we can showcase the new bst with a new inserted node + val.
    }
}