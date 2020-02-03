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
    public List<List<Integer>> levelOrder(TreeNode root) {
        ArrayList<List<Integer>> res=new ArrayList<>();
        if(root==null){return res;}
        
        ArrayList<Integer> temp=new ArrayList<>();
        LinkedList<TreeNode> queue=new LinkedList<TreeNode>(); 
        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();
            for(int i=0;i<size;i++){
                TreeNode current=queue.remove();
                temp.add(current.val);
                if(current.left!=null){
                    queue.add(current.left);
                }
                if(current.right!=null){
                    queue.add(current.right);
                }
    
               
            }
            res.add(temp);
            temp=new ArrayList<>();
        }
        return res;
    }
    
}
