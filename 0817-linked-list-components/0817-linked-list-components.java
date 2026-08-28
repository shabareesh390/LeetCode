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
    public int numComponents(ListNode head, int[] nums) {
        boolean[] present = new boolean[10001];

        for (int num : nums) {
            present[num] = true;
        }

        int count = 0;
        ListNode curr = head;

        while (curr != null) {
            if (present[curr.val] && 
                (curr.next == null || !present[curr.next.val])) {
                count++;
            }
            curr = curr.next;
        }

        return count;
    }
}