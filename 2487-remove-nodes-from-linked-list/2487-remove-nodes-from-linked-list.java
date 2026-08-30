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
    public ListNode reverse(ListNode head){
        if(head==null||head.next==null){
            return head;
        }
        ListNode newHead=reverse(head.next);
       ListNode front=head.next;
         front.next=head;
         head.next=null;
        return newHead;
    }
    public ListNode removeNodes(ListNode head) {
    //   if(head==null||head.next==null){
    //     return head;
    //   }
    //   ListNode nxt=removeNodes(head.next);
    //    if(head.val<nxt.val){
    //     return nxt;
    //    }
    //    head.next=nxt;
    //    return head;
    head=reverse(head);
    int max=head.val;
    ListNode curr=head;
    while(curr.next!=null){
        if(curr.next.val<max){
            curr.next=curr.next.next;

        }
        else{
           curr=curr.next;
           max=curr.val;
        }
    }
    head=reverse(head);
    return head;
    }
}