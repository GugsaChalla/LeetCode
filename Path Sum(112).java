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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){return false;}
        return dfs(sum,root);
    }
    
public boolean dfs(int num, TreeNode current){
         if(current==null){return false;}
        if(num-current.val==0&&current.left==null&current.right==null){return true;}
        return dfs(num-current.val, current.left) || dfs(num-current.val,current.right);
       
    }
}
