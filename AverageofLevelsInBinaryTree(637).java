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
    public List<Double> averageOfLevels(TreeNode root) {
        LinkedList<TreeNode> q = new LinkedList<>();
        List<Double> list = new ArrayList<>();
        if(root==null){return list;}
        double sum=0;
        double count=0;
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            TreeNode current = q.remove();
            if(current==null){
                q.add(null);
                list.add(sum/count);
                count=0;
                sum=0;
                if(q.getFirst()==null){break;}
            }
            else{
                count++;
                sum=sum+current.val;
                if(current.left!=null){q.add(current.left);}
                if(current.right!=null){q.add(current.right);}
            }
        }
        return list;
    }
}