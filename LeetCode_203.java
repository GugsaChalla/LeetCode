/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
       ListNode res=new ListNode(0);
       ListNode resHead=res;
        while(head!=null){
            if(head.val!=val){
                res.next=new ListNode(head.val);
                res=res.next;
            }
            head=head.next;
        }
        return resHead.next;
           
       }
           
    }
           
    
        
    
