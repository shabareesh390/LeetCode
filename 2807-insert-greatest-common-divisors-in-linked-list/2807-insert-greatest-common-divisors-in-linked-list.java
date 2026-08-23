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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head;
        ListNode curr=head.next;
        
        
        while(curr != null){
            int ans=0;
            if(prev.val > curr.val){
               ans=gcd(prev.val,curr.val);
            }
            else{
               ans=gcd(curr.val,prev.val);
            }
            ListNode newNode=new ListNode(ans);
            
            ListNode temp=prev.next;
            prev.next=newNode;
            newNode.next=temp;
            prev=curr;
            curr=curr.next;
        }
        return head;
    }
    static int gcd(int n1,int n2){
        while(n2!=0){
            int rem=n1/n2;
            rem=n1 % n2;
            n1=n2;
            n2=rem;
        }
        return n1;
    }
}