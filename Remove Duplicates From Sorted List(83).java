/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null ||head.next==null){return head;}
        ListNode current=head;
        ListNode resHead=new ListNode(0);
        ListNode res=resHead;
        while(current.next!=null){
            if(current.val==current.next.val){
                current=current.next;
            }
            else{
                res.next=new ListNode(current.val);
                res=res.next;
                current=current.next;
            }
        }
         res.next=new ListNode(current.val);
         res=res.next;
        return resHead.next;
    }
}
