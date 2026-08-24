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
    public ListNode mergeNodes(ListNode head) {

        ListNode ans = new ListNode(0);
        ListNode point = ans;

        ListNode curr = head.next; 
        int sum = 0;

        while (curr != null) {

            if (curr.val == 0) {
                point.next = new ListNode(sum);
                point = point.next;
                sum = 0;
            } else {
                sum += curr.val;
            }

            curr = curr.next;
        }

        return ans.next;
    }
}