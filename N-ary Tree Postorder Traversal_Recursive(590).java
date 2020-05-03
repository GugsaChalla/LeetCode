/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
         return helper(root,list);
    }
    public List<Integer> helper (Node root, List<Integer> list){
        if(root==null){return list;}
        for(int i=0;i<root.children.size();i++){
            helper(root.children.get(i),list);
        }
        list.add(root.val);
        return list;
    }
}