/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        //BFS Approach.
        if(root == null){
            return null;
        }

        Queue<Node> q = new LinkedList<>();
        q.offer(root); //add the first root to the queue.

        while(!q.isEmpty()){//check if the q is empty.
            Node rightnode = null;//se the rightmost node to null.
            for(int i = q.size(); i > 0; i--){//iterate from the end.
                Node curr = q.poll();//pop the element in the current node.
                curr.next = rightnode;//point the curr.next to rightnode which is null.
                rightnode = curr;//move the rightnode forwards.
                if(curr.right != null){//if the curr.right is not null.
                    q.offer(curr.right);//offer right then left so it goes backward.
                    q.offer(curr.left);
                }
            }
        }

        return root;//return the root.
    }
}