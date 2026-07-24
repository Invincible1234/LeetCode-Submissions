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
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1); //use a helper function.
    }

    private TreeNode helper(int[] arr, int left, int right){//use the array, left, and right.
        if(left > right) return null;//if the left is greater than right, return null.

        int mid = (left + right) / 2;//find the middle element.

        TreeNode root = new TreeNode(arr[mid]);//set that the TreeNode root to be the mid.

        root.left = helper(arr, left, mid - 1);//recurrsively do the same for left/
        root.right = helper(arr, mid + 1, right);//recurrsively do the same for the right as well/

        return root;//return the root to return the whole new constructed binary tree.
    }
}