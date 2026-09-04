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
    public ListNode swapPairs(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        ListNode tail=dummy;
        ListNode first=head;
        while(first!=null&&first.next!=null){
            ListNode second=first.next;
            ListNode next=second.next;
            tail.next=second;
            second.next=first;
            first.next=next;
            tail=first;
            first=next;
             
        }
        return dummy.next;
    }
}