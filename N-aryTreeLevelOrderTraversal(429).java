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
    public List<List<Integer>> levelOrder(Node root) {
        List<Integer> small = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        LinkedList<Node> q = new LinkedList<>();
        
        if(root==null){return list;}
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node current = q.remove();
            if(current==null){
                q.add(null);
                list.add(small);
                small = new ArrayList<>();
                if(q.getFirst()==null){break;}
            }
            else{
                small.add(current.val);
                int i=0;
                //traversing through each child node
                while(i<current.children.size()){
                    q.add(current.children.get(i));
                    i++;
                }
            }
        }
        return list;
    }
}