import java.util.HashSet;

public boolean hasCycle(Node head) {

    HashSet<Node> set = new HashSet<>();

    Node temp = head;

    while (temp != null) {

        if (set.contains(temp))
            return true;

        set.add(temp);

        temp = temp.next;
    }

    return false;
}
