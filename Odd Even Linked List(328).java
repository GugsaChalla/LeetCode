/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head==null||head.next==null){return head;}
        ListNode res=new ListNode(0);
        ListNode resHead=res;
        ListNode even = new ListNode(0);
        ListNode evenHead=even;
        
        while(head!=null){
            res.next=head;
            res=res.next;
            head=head.next;
            if(head==null){
                even.next=null;
                break;
            }
            
            even.next=head;
            even=even.next;
            head=head.next; 
            
            }
        
        res.next=evenHead.next;
        return resHead.next; 
        }
    }
