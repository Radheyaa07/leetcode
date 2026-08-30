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
    //     ListNode newHead=reverse(head);
    //     ListNode front=head.next;
    //     front.next=head;
    //     head.next=null;
    //     return newHead;
    // }
    public ListNode removeNodes(ListNode head) {
      if(head==null||head.next==null){
        return head;
      }
      ListNode nxt=removeNodes(head.next);
       if(head.val<nxt.val){
        return nxt;
       }
       head.next=nxt;
       return head;
    }
}