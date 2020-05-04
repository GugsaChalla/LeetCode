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
        LinkedList<Integer> q = new LinkedList<>();
        if(root==null){return q;}
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            Node current = stack.pop();
            for(int i=0;i<current.children.size();i++){
                stack.push(current.children.get(i));
            }
            q.addFirst(current.val);
        }
        return q;
    }
}