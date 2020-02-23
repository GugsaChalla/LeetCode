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
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        int max= Integer.MIN_VALUE;
        LinkedList<TreeNode> q = new LinkedList<>();
        
        if(root==null){
            return list;
        }
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            TreeNode current = q.remove();
            if(current==null){
                q.add(null);
                list.add(max);
                max=Integer.MIN_VALUE;
                if(q.getFirst()==null){break;}
            }
            else{
                if(max<current.val){
                    max = current.val;
                }
            if(current.right!=null){q.add(current.right);}
            if(current.left!=null){q.add(current.left);}
            }
            
        }
        return list;
    }
}