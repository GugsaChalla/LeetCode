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
    public boolean isCousins(TreeNode root, int x, int y) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int parent1 = -1, parent2 = -1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0; i < size; i++){
                TreeNode current = q.remove();
                if(current.left != null){
                    if(current.left.val == x || current.left.val == y){
                        if(parent1 == -1){
                           parent1 = current.val; 
                        }
                        else{
                            parent2 = current.val;
                        }    
                    } 
                    q.add(current.left);
                }
                if(current.right != null){
                    if(current.right.val == x || current.right.val == y){
                        if(parent1 == -1){
                            parent1 = current.val;
                        } 
                        else{
                            parent2 = current.val;
                        } 
                    }
                    q.add(current.right);
                }
                if(parent1 != -1 && parent2 != -1){
                    return parent1 != parent2;
                }
                    
            }
            if(! (parent1 == -1 && parent2 == -1)){return false;} 
        }
        return false;
    }
        
    }
