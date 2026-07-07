class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {

    public static Node deleteTail(Node head) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Only one node
        if (head.next == null) {
            return null;
        }

        Node temp = head;

        // Reach second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Delete last node
        temp.next = null;

        return head;
    }
}
