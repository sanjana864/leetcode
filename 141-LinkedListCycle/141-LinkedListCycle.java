// Last updated: 14/07/2026, 16:04:59
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       
             
            fast = fast.next.next;     

            if (slow == fast) {
                return true; 
            }
        }

        return false; 
    }
}