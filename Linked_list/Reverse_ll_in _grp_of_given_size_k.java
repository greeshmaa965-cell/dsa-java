class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        ListNode temp = head;
        ListNode prevLast = null;

        while (temp != null) {

            ListNode kthNode = getKthNode(temp, k);

            if (kthNode == null) {

                if (prevLast != null)
                    prevLast.next = temp;

                break;
            }

            ListNode nextNode = kthNode.next;
            kthNode.next = null;

            ListNode newHead = reverse(temp);

            if (temp == head)
                head = newHead;
            else
                prevLast.next = newHead;

            prevLast = temp;
            temp = nextNode;
        }

        return head;
    }

    private ListNode getKthNode(ListNode temp, int k) {

        k--;

        while (temp != null && k > 0) {
            temp = temp.next;
            k--;
        }

        return temp;
    }

    private ListNode reverse(ListNode head) {

        ListNode prev = null;

        while (head != null) {

            ListNode front = head.next;
            head.next = prev;
            prev = head;
            head = front;
        }

        return prev;
    }
}
