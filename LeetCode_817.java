/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public int numComponents(ListNode head, int[] G) {
        HashSet<Integer> set = new HashSet<>();
        int count=0;
        for(int i=0;i<G.length;i++){  set.add(G[i]); }
        while(head.next!=null){
            if(set.contains(head.val) && set.contains(head.next.val)){
                count++;
            }
            head=head.next;
        }
           return G.length-count;
    }
}