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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums, 0, nums.length-1);
    }
    
    public TreeNode helper(int[] nums, int first, int last){
        if(first>last) return null;
        int index=0, max= Integer.MIN_VALUE;
        
        for(int i=first;i<=last;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }
        
        TreeNode root = new TreeNode(max);
        root.left=helper(nums,first,index-1); 
        root.right= helper(nums,index+1,last);
        return root;
    }
}
