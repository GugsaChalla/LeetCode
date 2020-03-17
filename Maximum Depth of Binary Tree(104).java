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
    public int maxDepth(TreeNode root) {
        if(root==null){return 0;}
        int num=0;
        return dfs(root,num);
    }
    
    public int dfs(TreeNode node,int depth){
        if(node==null){
            return depth;
        }
        depth++;
        return depth+Math.max(dfs(node.left,0),dfs(node.right,0));
    }
}