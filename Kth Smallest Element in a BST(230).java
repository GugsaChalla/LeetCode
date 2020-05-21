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
     public int kthSmallest(TreeNode root, int k) {
        int [] nums = new int[2];
         helper(root, nums, k);
        return nums[1];
     }
    
     public void helper(TreeNode root,int[]nums, int k) {
        if (root==null){return;}
        helper(root.left,nums,k);
        if(++nums[0]==k){
            nums[1]=root.val;
            return;
        }
        helper(root.right,nums,k);
     }
 
}