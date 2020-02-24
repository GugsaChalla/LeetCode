/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode resHead= head;
        int sum=0;
        while(l1!=null&&l2!=null){
             sum=sum+l1.val+l2.val;
            if(sum>9){
            head.next = new ListNode(sum%10);
            sum=sum/10;
            }
            else{
                head.next= new ListNode(sum);
                sum=0;
            }
            head=head.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
             sum=sum+l1.val;
            if(sum>9){
            head.next = new ListNode(sum%10);
            sum=sum/10;
            }
            else{
                head.next= new ListNode(sum);
                sum=0;
            }
            head=head.next;
            l1=l1.next;
        }
        while(l2!=null){
            sum=sum+l2.val;
            if(sum>9){
            head.next = new ListNode(sum%10);
            sum=sum/10;
            }
            else{
                head.next= new ListNode(sum);
                sum=0;
            }
            head=head.next;
            l2=l2.next;
        }
        if(sum!=0&l1==null&l2==null){head.next= new ListNode(sum);}
        
        return resHead.next;
    }
}
