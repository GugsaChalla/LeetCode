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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if(root==null){return list;}
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode current = q.remove();
            if(current==null){
                q.add(null);
                if(q.getFirst()==null){break;}
                
            }
            else{
                if(q.getFirst()==null){list.add(current.val);}
                if(current.left!=null){
                    q.add(current.left);
                }
                if(current.right!=null){
                    q.add(current.right);
                }
                 
                
            }
        }
        return list;
    }
}
