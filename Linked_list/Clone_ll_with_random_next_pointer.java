class Solution {

    public Node copyRandomList(Node head) {

        if (head == null)
            return null;

        Node temp = head;

        // Step 1: Insert copy nodes
        while (temp != null) {

            Node copy = new Node(temp.val);

            copy.next = temp.next;
            temp.next = copy;

            temp = copy.next;
        }

        // Step 2: Set random pointers
        temp = head;

        while (temp != null) {

            if (temp.random != null)
                temp.next.random = temp.random.next;

            temp = temp.next.next;
        }

        // Step 3: Separate lists
        Node dummy = new Node(-1);
        Node copyTail = dummy;

        temp = head;

        while (temp != null) {

            Node copy = temp.next;

            temp.next = copy.next;

            copyTail.next = copy;
            copyTail = copy;

            temp = temp.next;
        }

        return dummy.next;
    }
}
