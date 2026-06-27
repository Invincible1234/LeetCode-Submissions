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
    public int maxDepth(TreeNode root) { //BFS approach, notice vertices(circles) vs edges(paths).
        if(root == null){ //check the root if it is null.
            return 0;//if so, return 0;
        }
        int level = 0;//initiate a level checker with int level.
        Queue<TreeNode> q = new LinkedList();//a queue of type TreeNode
        q.offer(root);//add root to the queue.

        while(!q.isEmpty()){//check where the q is empty, if not, continue.
            int size = q.size();//set size of the queue.
            for(int i = 0; i < size; i++){//iterate in the range of the size.
                TreeNode node = q.poll();//return and store the last element in the queue.
                if(node.left != null){//if the left is not null. store it in the queue.
                    q.offer(node.left);
                }
                if(node.right != null){//if the right is not null. store it in the queue.
                    q.offer(node.right);
                }
            }
            level += 1;//increment the level by 1
        }
        return level;//return it.
    }
}