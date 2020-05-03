/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<Integer> q = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){return q;}
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode current = stack.pop();
            if(current.right!=null){stack.add(current.right);}
            if(current.left!=null){stack.add(current.left);}
            q.add(current.val);
        }
        return q;
    }
}