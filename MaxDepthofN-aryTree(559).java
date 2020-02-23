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
        int count=0;
        LinkedList<Node>q =new LinkedList<>();
        if(root==null){return 0;}
        q.add(root);
        q.add(null);
        
        while(!q.isEmpty()){
            Node current = q.remove();
            if(current==null){
                q.add(null);
                count++;
                if(q.getFirst()==null){break;}
            }
            else{
                if(current.children.size()!=0){
                     for(int i=0;i<current.children.size();i++){
                         q.add(current.children.get(i));
                     }
                }
               
            }
        }
        return count;
    }
}