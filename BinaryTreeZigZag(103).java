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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> big = new ArrayList<>();
        if(root==null){return big;}
        int count=0;
        LinkedList<TreeNode> q = new LinkedList<>();
        q.add(root);
        q.add(null);
         List<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while(!q.isEmpty()){
            TreeNode current = q.remove();
            if(current==null){
                while(!stack.isEmpty()){list.add(stack.pop());}
                
                big.add(list);
                list = new ArrayList<>();
                q.add(null);
                count++;
                if(q.getFirst()==null){break;}
            }
            else{
                if(current.left!=null){q.add(current.left);}
                if(current.right!=null){ q.add(current.right); }
                 
                if(count%2==0){
                list.add(current.val);
                }
                else{
                    stack.push(current.val);    
                }
                
            }
        }
        return big;
    }
}