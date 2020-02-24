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
    public List<Integer> postorderTraversal(TreeNode root) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        return help(root, arr);
    }
    
    public ArrayList<Integer> help(TreeNode root, ArrayList<Integer> array){
        if (root==null){
            return array;
        }
        if(root.left!=null){
            array=help(root.left,array);
        }
        if(root.right!=null){
            array=help(root.right,array);
        }
        array.add(root.val);
        return array;
    }
    
}
