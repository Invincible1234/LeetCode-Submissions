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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        if(root == null){ //checks if the root is null, then retures empty list.
            return res;
        }
        //Since BFS uses Queue data structure, we use a linked list Queue to process everything.
        Queue<TreeNode> queue = new LinkedList<>(); //Initialize the queue.
        queue.offer(root); //add the first element which is the tree root.

        while(!queue.isEmpty()){ //the while loop goes on until is is empty.
            int size = queue.size(); //gets the size of the queue.
            List<Integer> level = new ArrayList<>(); //this is the level by level list.

            for(int i = 0; i < size; i++){ //for loop iterates until the size.
                TreeNode current = queue.poll(); //returns the added value to current.
                level.add(current.val); // add it to the level list.

                if(current.left != null){ //checks if it has left child, if so add it to queue
                    queue.offer(current.left);
                }
                if(current.right != null){ //checks if it has right child, if so add it to queue.
                    queue.offer(current.right);
                }
            }
            res.add(level); // adds whatever element is in the level to the final list.
        }
        return res; //returns the 2d arraylist with every element contained.
        /*Notes for self: Get better at handling queue data structure. BFS is level based.
        * when traversing through bfs, have a level list to process each level.
        * keep track of the queue size, big help.
        */

    }
}