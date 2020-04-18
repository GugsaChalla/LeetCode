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
    public int maxDepth(Node root) {
        if(root==null){return 0;}
        List<Integer> list = new ArrayList<>();
        int max=1;
        if(root.children.size()!=0){
            for(int i=0;i<root.children.size();i++){
            list.add(maxDepth(root.children.get(i)));
            }
            for(int i=0;i<list.size();i++){
                max=Math.max(list.get(i),max);
            }
            return max+1;
        }
        else{return 1;}
    }
        
}
