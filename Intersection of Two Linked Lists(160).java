/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int i=0,j=0;
        if(headA==null||headB==null){ return null;}
        ListNode currentA=headA;
        ListNode currentB=headB;
        
        while(currentA!=null){
            currentA=currentA.next;
            i++;
        }
        while(currentB!=null){
            currentB=currentB.next;
            j++;
        }
        currentA=headA;
        currentB=headB;
        while(i>j){
            currentA=currentA.next;
            i--;
        }
        while(j>i){
            currentB=currentB.next;
            j--;
        }
        while(currentA!=null&&currentB!=null){
            if(currentA==currentB){
                ListNode intersect=new ListNode(currentA.val);
                return intersect;
            }
            currentA=currentA.next;
            currentB=currentB.next;
        }
        return null;
    }
}
