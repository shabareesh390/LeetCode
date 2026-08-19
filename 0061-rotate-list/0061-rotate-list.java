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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || head.next==null || k==0){
            return head;
        }
        int len = 1;
        ListNode curr = head;

        while (curr.next != null) {
            curr = curr.next;
            len++;
        }

        k = k % len;

        if (k == 0) {
            return head;
        }
        for(int i=0;i<k;i++){
            curr=head;
            ListNode prev=null;
            while(curr.next != null){
                prev=curr;
                curr=curr.next;
            }
            curr.next=head;
            head=curr;
            prev.next=null;
        }
        return head;
        
    }
}