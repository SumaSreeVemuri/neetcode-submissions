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
    public ListNode merge2Lists(ListNode head1, ListNode head2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        ListNode l1 = head1, l2 = head2;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = l1;
                temp = l1;
                l1 = l1.next;
            } else {
                temp.next = l2;
                temp = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null)
            temp.next = l1;
        else
            temp.next = l2;
        return dummy.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n = lists.length;
        ListNode merged = null;
        for (int i = 0; i < n; i++) {
            merged = merge2Lists(lists[i], merged);
        }
        return merged;
    }
}
