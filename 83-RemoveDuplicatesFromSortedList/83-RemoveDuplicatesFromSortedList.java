// Last updated: 14/07/2026, 16:05:21
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                // skip duplicate node
                curr.next = curr.next.next;
            } else {
                // move forward
                curr = curr.next;
            }
        }

        return head;
    }
}