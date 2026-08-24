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
    public int pairSum(ListNode head) {
        if(head.next==null){
            return head.val;
        }
       ArrayList<Integer> list=new ArrayList<>();
       ListNode curr=head;
       int max=0;
      
       int n=0;
       while(curr != null){
        list.add(curr.val);
        n++;
        curr=curr.next;
       } 
       if(list.isEmpty()){
        return -1;
       }
       for(int i = 0;i <= (n / 2) - 1;i++){
        int twin=n-1-i;
        int sum=list.get(i)+list.get(twin);
        max=Math.max(max,sum);
       }
       return max;
    }
}