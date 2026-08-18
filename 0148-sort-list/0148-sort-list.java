class Solution {
     public ListNode sortList(ListNode head){
            if(head==null || head.next==null){
                return head;
            }
            ListNode mid=getMid(head);
            ListNode rightHead=mid.next;
            mid.next=null;
            ListNode left=sortList(head);
            ListNode right=sortList(rightHead);
            return merge(left,right);

        }
        public ListNode getMid(ListNode head){
            ListNode slow=head;
            ListNode fast=head.next;
            while (fast!=null && fast.next!=null){
                fast=fast.next.next;
                slow=slow.next;
            }
            return slow;
        }
        public ListNode merge(ListNode list1,ListNode list2){
            if(list1==null){
                return list2;
            }
            if(list2==null){
                return list1;
            }
            if(list1.val<= list2.val){
                list1.next=merge(list1.next,list2);
                return list1;
            }
            else {
                list2.next=merge(list1,list2.next);
                return list2;
            }
        }
}