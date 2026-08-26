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
    public ListNode removeNodes(ListNode head) {

        List<Integer> list = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) {
            list.add(curr.val);
            curr = curr.next;
        }

        int max = -1;

        for (int i = list.size() - 1; i >= 0; i--) {

            if (list.get(i) >= max) {
                max = list.get(i);
            } else {
                list.remove(i);
            }
        }

        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        for (int val : list) {
            temp.next = new ListNode(val);
            temp = temp.next;
        }

        return dummy.next;
    }
}