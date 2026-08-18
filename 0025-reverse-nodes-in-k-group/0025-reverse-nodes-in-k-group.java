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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null || k==1){
            return head;
        }
        ListNode curr=head;
        ListNode prev=null;
        for(int i=0;i<k;i++){
            if(curr==null){
                return head;
            }
            prev=curr;
            curr=curr.next;
        } 
        ListNode nextG=curr;
        prev.next=null;    
        ListNode rev=revRec(head);
        head.next=reverseKGroup(nextG, k);

        return rev;
    }
    public ListNode revRec(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode=revRec(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
    }
}