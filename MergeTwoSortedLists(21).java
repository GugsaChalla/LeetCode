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
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode answer= new ListNode(0); ListNode merge=answer;
        ListNode currentL1=l1;
        ListNode currentL2=l2;
        while(currentL1!=null&&currentL2!=null){
            if(currentL1.val<currentL2.val){
                merge.next=new ListNode(currentL1.val);
                currentL1=currentL1.next;
                merge=merge.next;
            }
            else{
                merge.next=new ListNode(currentL2.val);
                currentL2=currentL2.next;
                merge=merge.next;
            }
        }
        while(currentL1!=null){
            merge.next=currentL1;
            currentL1=currentL1.next;
            merge=merge.next;
        }
        while(currentL2!=null){
            merge.next=currentL2;
            currentL2=currentL2.next;
            merge=merge.next;
        }
        return answer.next;
}
}
