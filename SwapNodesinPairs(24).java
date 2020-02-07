/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode current=head.next;
        ListNode prev=null;
        int count=0;
        while(head!=null&&head.next!=null){
            ListNode temp = head.next.next;
            head.next.next=head;
            if(count>0){
                prev.next=head.next;
            }
            head.next=temp;
             prev=head;
            head=head.next;
            count++;
           // System.out.println(head.val);
           
        }
        return current;
    }
}