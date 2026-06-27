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
    public int minDepth(TreeNode root) {
        if(root == null){ //BFS Approach.
            return 0;//if root = null, return 0;
        }
        Queue<TreeNode> q = new LinkedList(); //create a queue
        int level = 1;//start with level 1 since depth of leaf is 1.
        q.offer(root);//add the root to queue.

        while(!q.isEmpty()){ //check if it empty or not.
            int size = q.size();//get the size of the q which is one.
            while(size > 0){ //run a while loop until the size is 0
                TreeNode node = q.poll();// returns the last element
                if(node.left == null && node.right == null){//checks if the left & right are null.
                    return level;//if so return the current level.
                }
                if(node.left != null){//check if left is null
                    q.offer(node.left);//if not, add to the queue.
                }
                if(node.right != null){//check if right is null.
                    q.offer(node.right);//if not, add to the queue.
                }
                size--;//decrease the size
            }
            level += 1;//if all of the above is true then add +1 to the level.
            
        }
        return level;//return the level.
    }
}