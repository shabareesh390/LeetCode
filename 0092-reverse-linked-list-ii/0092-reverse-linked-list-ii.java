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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode prev=null;
        ListNode curr=head;
        for(int i=1;i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode start=curr;
        for(int i=left;i<right;i++){
            curr=curr.next;
        }
        ListNode after=curr.next;
        curr.next=null;
        ListNode reversed=rev(start);

        if(prev==null){
            head=reversed;
        }
        else{
            prev.next=reversed;
        }
        start.next=after;
        return head;
       
    }
    static ListNode rev(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newNode=rev(head.next);
        head.next.next=head;
        head.next=null;
        return newNode; 
    }
}