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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null){
            return;
        }
        ListNode mid=getMid(head);
        ListNode second=rev(mid.next);
        mid.next=null;
        ListNode first=head;
        while(second != null ){
            ListNode temp1=first.next;
            ListNode temp2=second.next;
            first.next=second;
            second.next=temp1;
            first=temp1;
            second=temp2;
        }
        
    }
    static ListNode getMid(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head.next;
        while (fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
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