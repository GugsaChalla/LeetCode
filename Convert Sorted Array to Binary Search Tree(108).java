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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length==0){return null;}
        if(nums.length==1){return new TreeNode(nums[0]);}
        int index = nums.length/2;
        int[] arr = new int[index];
        for(int i=0;i<index;i++){arr[i]=nums[i];}
        TreeNode root= new TreeNode(nums[index]);
        root.left=sortedArrayToBST(arr);
        int[] arr2;
        if(nums.length==2){arr2= new int[index];}
        else{arr2= new int[nums.length-1-index];}
        if(nums.length>index+1){
            for(int i=arr2.length-1;i>-1;i--){arr2[i]=nums[arr2.length+index];index--;}
            root.right=sortedArrayToBST(arr2);
        }
        return root;
        
    }
}