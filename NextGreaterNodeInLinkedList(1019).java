/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        while(head!=null){
            list.add(head.val);
            head=head.next;
        }
        int[] arr = new int[list.size()];
       Stack<Integer> stack = new Stack<>();
        for(int i=0;i<list.size();i++){
            while(!stack.isEmpty() && list.get(i)>list.get(stack.peek())){
                
                    arr[stack.peek()]=list.get(i);
                    stack.pop();
            
                
                
            }
            
            stack.push(i); 
        }
        return arr;
        
    }
}
