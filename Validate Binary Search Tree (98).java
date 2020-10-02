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
    public boolean isValidBST(TreeNode root) {
         if(root==null) return true;
         if(root.left==null && root.right==null) return true;
         return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    public boolean helper(TreeNode root,long leftMin, long rightMin) {
        if (root==null) return true;
        if (root.val<=leftMin) return false;
        if (root.val>=rightMin) return false;
        return helper(root.left, leftMin, root.val) && helper(root.right, root.val, rightMin);
    }
}