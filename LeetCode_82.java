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
        if(head==null||head.next==null){return head;}
        ListNode current=head;
        ListNode resHead= new ListNode(0);
        ListNode res=resHead;
        int duplicate=0;
        while(current.next!=null){
            if(current.val==current.next.val){
                current=current.next;
                duplicate=1;
            }
            else{
                if(duplicate==1){
                    current=current.next;
                    duplicate=0;
                }
                else if(duplicate==0){
                    res.next=new ListNode(current.val);
                    res=res.next;
                    current=current.next;
                }
            }
        }
        if(duplicate==0){
            res.next=new ListNode(current.val);
            //=res.next;
        }
        return resHead.next;
    }
}