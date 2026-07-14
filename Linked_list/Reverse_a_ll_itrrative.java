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

        Node prev = null;
        Node current = head;

        while (current != null) {

            Node front = current.next;

            current.next = prev;

            prev = current;

            current = front;
        }

        return prev;
    }
}
