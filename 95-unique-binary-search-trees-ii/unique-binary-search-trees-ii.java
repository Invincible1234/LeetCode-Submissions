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
    public List<TreeNode> generateTrees(int n) {
        return n == 0 ? new ArrayList<>() : gen(1,n);
    }

    List<TreeNode> gen(int low, int high){
        List<TreeNode> ans = new ArrayList<>();
        if(low > high){
            ans.add(null);
            return ans;
        }
        for(int i = low; i <= high; i++){
            for(TreeNode l : gen(low, i - 1 )){
                for(TreeNode r : gen(i + 1, high)){
                    TreeNode x = new TreeNode(i);
                    x.left = l;
                    x.right = r;
                    ans.add(x);
                }
            }
        }

        return ans;
    }
}