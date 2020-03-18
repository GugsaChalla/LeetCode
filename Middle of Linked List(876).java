/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode middleNode(ListNode head) {
         ListNode current= head;
        int count=0;
        while(current!=null){
           current=current.next;
            count++;
        }
        current=head;
        for(int i=0;i<count/2;i++){
            current=current.next;
        }
        return current;
    }
}
