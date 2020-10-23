/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode resHead= res;
        int carry = 0;
        while(l1!=null&&l2!=null){
            int sum = l1.val+l2.val;
            l1=l1.next;
            l2=l2.next;
            if(carry==1){
                sum++;
            }
            if(sum>9){
                carry=1;
                sum=sum%10;
            }
            else{
                carry=0;
            }
            res.next=new ListNode(sum);
            res=res.next;
        }
        while(l2!=null){
            int sum =l2.val;
            if(carry==1){
                sum++;
            }
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            else{
                carry=0;
            }
            res.next = new ListNode(sum);
            l2=l2.next;
            res=res.next;
        }
        while(l1!=null){
            int sum = l1.val; 
            if(carry==1){
                sum++;
            }
            if(sum>9){
                sum=sum%10;
                carry=1;
            }
            else{
                carry=0;
            }
            res.next = new ListNode(sum);
            l1=l1.next;
            res=res.next;
        }
        if(carry==1){
            res.next= new ListNode(1);
        }
        return resHead.next;
    }
}