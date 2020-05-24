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
    int index = 0;
    public TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length==0){return null;}
        return helper(preorder, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    
    TreeNode helper(int[] preorder, int min, int max){
        if(index>=preorder.length){return null;}
        int val = preorder[index];
        if(val>min&&val<max){
            TreeNode root = new TreeNode(preorder[index]);
            index++;
            root.left =  helper(preorder, min, val);
            root.right = helper(preorder, val, max);
            return root;
        }
        else{return null;}
    }
}