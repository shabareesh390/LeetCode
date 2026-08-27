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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        
        int minDistance = Integer.MAX_VALUE;
        int first = -1;
        int previous = -1;
        
        ListNode prev = head;
        ListNode curr = head.next;
        int index = 1;
        
        while(curr.next != null) {
            
            if((curr.val > prev.val && curr.val > curr.next.val) ||
               (curr.val < prev.val && curr.val < curr.next.val)) {
                
                if(first == -1) {
                    first = index;
                } else {
                    minDistance = Math.min(minDistance, index - previous);
                }
                
                previous = index;
            }
            
            prev = curr;
            curr = curr.next;
            index++;
        }
        
        
        if(first == -1 || first == previous) {
            return new int[]{-1, -1};
        }
        
        int maxDistance = previous - first;
        
        return new int[]{minDistance, maxDistance};
    }
}