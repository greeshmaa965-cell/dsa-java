class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

public class Solution {

    public static Node reverseDLL(Node head) {

        if (head == null || head.next == null)
            return head;

        Node current = head;
        Node temp = null;

        while (current != null) {

            // Swap prev and next
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            // Move to the next node
            current = current.prev;
        }

        // New head
        return temp.prev;
    }
}
