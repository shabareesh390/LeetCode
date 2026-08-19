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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || n==0){
            return head;
        }
        ListNode curr=head;

        int len=1;
        while(curr.next!=null){
            len++;
            curr=curr.next;
        }
        if(n==len){
            return head.next;
        }
        ListNode prev=null;
        curr=head;
        for(int i=0;i<len-n;i++){
            prev=curr;
            curr=curr.next;
        }
        prev.next=curr.next;
        return head;

    }
}