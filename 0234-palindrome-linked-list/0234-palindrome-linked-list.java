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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=getMid(head);
        ListNode second=rev(mid);
        ListNode first=head;
        while (second != null){
            if(first.val!=second.val){
                return false;
            }
            first=first.next;
            second=second.next;
        }
        return true;

    }
    static ListNode getMid(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode slow=head;
        ListNode fast=head;
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