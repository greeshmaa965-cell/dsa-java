class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {

    public static Node insertAtEnd(Node head, int val) {

        Node newNode = new Node(val);

        // If list is empty
        if (head == null) {
            return newNode;
        }

        Node temp = head;

        // Reach the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Link last node to new node
        temp.next = newNode;

        return head;
    }
}
