class Solution {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast = head;
        ListNode slow = head;

        // Move fast n steps ahead
        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        // Delete head
        if (fast == null)
            return head.next;

        // Move both pointers
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }

        // Delete nth node
        slow.next = slow.next.next;

        return head;
    }
}
