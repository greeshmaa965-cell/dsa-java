class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {

    public static Node reverseList(Node head) {

        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }
}
