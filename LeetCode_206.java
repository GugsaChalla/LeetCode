/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head==null){return head;}
        
        ListNode current = head;
        ListNode prev =null;
        ListNode next=new ListNode(0);
        while(next!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            if(next!=null)current=next;
        }
        return current;
    }
}