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
    public int sumEvenGrandparent(TreeNode root) {
        if(root==null){return 0;}
        int sumL=0;
        int sumR=0;
        if(root.val%2==0){
            if(root.left!=null){if(root.left.left!=null){sumL=sumL+root.left.left.val;}}
            if(root.left!=null){if(root.left.right!=null){sumL=sumL+root.left.right.val;}}
            if(root.right!=null){if(root.right.left!=null){sumR=sumR+root.right.left.val;}}
            if(root.right!=null){if(root.right.right!=null){sumR=sumR+root.right.right.val;}}
        }
        int left=sumEvenGrandparent(root.left)+sumL;
        int right= sumEvenGrandparent(root.right)+sumR;
        return left+right;
    }
}