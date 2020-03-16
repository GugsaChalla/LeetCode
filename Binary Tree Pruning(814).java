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
    public TreeNode pruneTree(TreeNode root) {
        if(root==null){return null;}
        dfs(root);
        return root;
    }
    
    public boolean dfs (TreeNode node){
          if(node==null){return false;}
          boolean left =dfs(node.left);
          boolean right =dfs(node.right);
          if(left==false){node.left=null;}
          if(right==false){node.right=null;}
          return left||right||node.val==1;
    }
}