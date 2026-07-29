class Solution {

    static Node deleteAllOccurOfX(Node head, int x) {

        Node temp = head;

        while (temp != null) {

            if (temp.data == x) {

                Node nextNode = temp.next;
                Node prevNode = temp.prev;

                // If deleting the head
                if (prevNode == null) {
                    head = nextNode;
                } else {
                    prevNode.next = nextNode;
                }

                // If next node exists
                if (nextNode != null) {
                    nextNode.prev = prevNode;
                }

                temp = nextNode;
            } else {
                temp = temp.next;
            }
        }

        return head;
    }
}
