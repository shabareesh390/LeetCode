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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode prev = head;
        ListNode curr = head.next;
        int groupSize = 2;

        while (curr != null) {
            ListNode start = curr;
            int count = 0;

            for (int i = 0; i < groupSize && curr != null; i++) {
                count++;
                curr = curr.next;
            }

            if (count % 2 == 0) {
                ListNode last = null;
                ListNode temp = start;

                for (int i = 0; i < count; i++) {
                    ListNode after = temp.next;
                    temp.next = last;
                    last = temp;
                    temp = after;
                }

                prev.next = last;
                start.next = curr;
                prev = start;
            } else {
                prev = start;

                for (int i = 1; i < count; i++) {
                    prev = prev.next;
                }
            }

            groupSize++;
        }

        return head;
    }
}