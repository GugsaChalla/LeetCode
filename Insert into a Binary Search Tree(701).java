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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        TreeNode fin= new TreeNode(val);
        if(root==null){return fin;}
        if(val>root.val){root.right=insertIntoBST(root.right,val);}
        if(val<root.val){root.left=insertIntoBST(root.left,val);}
        return root;
    }
}