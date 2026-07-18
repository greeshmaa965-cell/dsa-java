class Solution {

    public int countNodesinLoop(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {

            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return findLength(slow);
            }
        }

        return 0;
    }

    private int findLength(Node meetingNode) {

        Node temp = meetingNode;
        int count = 1;

        temp = temp.next;

        while (temp != meetingNode) {
            count++;
            temp = temp.next;
        }

        return count;
    }
}
