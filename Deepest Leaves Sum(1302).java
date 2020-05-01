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
    public int deepestLeavesSum(TreeNode root) {
        if(root==null){return 0;}
        LinkedList<TreeNode> q = new LinkedList<>();
        int sum=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode current=q.remove();
            if(current==null){
                
                q.add(null);
                if(q.getFirst()==null){break;}
                sum=0;
            }
            else{
                sum=sum+current.val;
                if(current.left!=null){q.add(current.left);}
                if(current.right!=null){q.add(current.right);}
            }
            
        }
        return sum;
    }
}


    