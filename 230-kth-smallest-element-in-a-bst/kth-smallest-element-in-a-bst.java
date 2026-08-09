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
    public int kthSmallest(TreeNode root, int k) {
        ArrayDeque<TreeNode> fin = new ArrayDeque<>();//create a new array dequeue.

        while(root != null || !fin.isEmpty()){//for the first while loop to check if the root is either null or if the array dequeue is not empty.
            while(root != null){//run the whileloop to check if the root is null if the latter condition is true for the previous outer whileloop.
                fin.push(root);//push int the fin arraydeque.
                root = root.left;//set the root to the left child of the root.
            }
            root = fin.pop();//in the outer whileloop, pop the most recent element in the fin and set it to the root.
            if(--k == 0) return root.val;//if the following condition is true then return the root.
            root = root.right;//finally set the root to the right child of the root.
        }
        throw new IllegalArgumentException();//throw whatever this is to make it work i guess.
    }
}