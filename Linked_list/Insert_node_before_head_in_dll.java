class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class Solution {

    public static Node insertBeforeHead(Node head, int val) {

        Node newNode = new Node(val);

        // Empty DLL
        if (head == null) {
            return newNode;
        }

        newNode.next = head;
        head.prev = newNode;

        return newNode;
    }
}
