class Solution {

    public Node addOne(Node head) {

        int carry = helper(head);

        if (carry == 1) {
            Node newHead = new Node(1);
            newHead.next = head;
            return newHead;
        }

        return head;
    }

    private int helper(Node node) {

        if (node == null)
            return 1;

        int carry = helper(node.next);

        int sum = node.data + carry;

        node.data = sum % 10;

        return sum / 10;
    }
}
