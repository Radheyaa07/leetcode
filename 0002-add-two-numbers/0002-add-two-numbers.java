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
    // private ListNode reverse(ListNode head){
    //     if(head==null||head.next==null){
    //         return head;
    //     }
    //     ListNode newHead=reverse(head.next);
    //     ListNode front=head.next;
    //     front.next=head;
    //     head.next=null;
    //     return newHead;
    // }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // l1=reverse(l1);
        // l2=reverse(l2);
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        int carry=0;
        while(l1!=null||l2!=null){
            int sum=carry;
            if(l1!=null){
                sum+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                sum+=l2.val;
                l2=l2.next;
            }
            carry=sum/10;
             int digit=sum%10;
            ListNode curr=new ListNode(digit);
            tail.next=curr;
            tail=tail.next;
        }
         if(carry>0){
            tail.next=new ListNode(carry);
         }
            return dummy.next;
    }
}