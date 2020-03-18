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
    public int minDepth(TreeNode root) {
        int num=0;
        return dfs(root,num);
    }
    public int dfs(TreeNode node,int depth){
        if(node==null){
            return depth;
        }
        depth++;
        if(node.left==null&&node.right!=null){return dfs(node.right,0)+depth;}
        if(node.right==null&&node.left!=null){return dfs(node.left,0)+depth;}
        return  depth+ Math.min(dfs(node.left,0),dfs(node.right,0));
    }
}