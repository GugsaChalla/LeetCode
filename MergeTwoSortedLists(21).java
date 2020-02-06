/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){return null;}
  
    ListNode res = new ListNode(0);
        ListNode resHead=res;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                res.next=new ListNode(l1.val);
                l1=l1.next;
            }
            else{
                res.next=new ListNode(l2.val);
                l2=l2.next;
            }
            res=res.next;
        }
        while(l1!=null){
            res.next=new ListNode(l1.val);
            res=res.next;
            l1=l1.next;
        }
        while(l2!=null){
            res.next=new ListNode(l2.val);
            res=res.next;
            l2=l2.next;
        }
        return resHead.next;
    }
}
