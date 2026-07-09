class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Solution {

    public static boolean search(Node head, int key) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                return true;
            }

            temp = temp.next;
        }

        return false;
    }
}
