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
    public int findBottomLeftValue(TreeNode root) {
        LinkedList<TreeNode>q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int hold=root.val;
        
        while(!q.isEmpty()){
            TreeNode current = q.remove();
            if(current==null){
                q.add(null);
                if(q.getFirst()==null){break;}
                else{hold=q.getFirst().val;}
            }
            
            else{
                if(current.left!=null){q.add(current.left);}
                if(current.right!=null){q.add(current.right);}
            }
        }
        return hold;
    }
}