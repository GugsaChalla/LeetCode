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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        if(nums.length==1){
            TreeNode root= new TreeNode(nums[0]);
            return root;
        }
        
        int max = Integer.MIN_VALUE;
        int index=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
                 index=i;
            }
        }
        
        TreeNode root= new TreeNode(max);
        if(index<nums.length-1){
            int arr[] = new int[nums.length-1-index];
            for(int i=index+1;i<nums.length;i++){
                arr[i-index-1]=nums[i];
            }
            root.right=constructMaximumBinaryTree(arr);
            
        }
        else{root.right= null;}
        
        if(index>0){
            int array[] = new int[index];
            for(int i=0;i<index;i++){
                array[i]=nums[i];
            }
            root.left=constructMaximumBinaryTree(array);
        }
        else{root.left=null;}
        return root;
    }
}