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
    public boolean isBalanced(TreeNode root) {
        return checker(root) != -1;//checks the root.

    }

    private int checker(TreeNode node){
        if(node == null){
            return 0;
        }
        int l = checker(node.left);//checks the left subtree.
        if(l == -1){
            return -1;
        }

        int r = checker(node.right);//checks the right subtree.
        if(r == -1){
            return -1;
        }

        if(Math.abs(l - r) > 1){//checks the absolute value of the difference between the left and right subtree and it must be no more than fucking 1. and it it is return -1.
            return -1;
        }

        return Math.max(l, r) + 1;//return the height of the entire tree + 1 (accounting for the root node itself).

        //check back in the morning and do more. 

        //tomorrow's topics: mergesort, bfs, dfs, topological sort, linked list, and recurrsion. grind leetcode.
        //GRIND GRIND GRIND GRIND GRIND GRIND GRIND no matter what, WIN FOR YOUR FUTURE.



    }
}