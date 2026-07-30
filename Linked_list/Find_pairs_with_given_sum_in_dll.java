///////////////////////brute sol///////////
class Solution {

    public static ArrayList<ArrayList<Integer>> findPairs(Node head, int target) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for (Node first = head; first != null; first = first.next) {

            for (Node second = first.next; second != null; second = second.next) {

                if (first.data + second.data == target) {

                    ArrayList<Integer> pair = new ArrayList<>();
                    pair.add(first.data);
                    pair.add(second.data);

                    ans.add(pair);
                }
            }
        }

        return ans;
    }
}
////////////////////////////optimal solution/////////////////
class Solution {

    public static ArrayList<ArrayList<Integer>> findPairs(Node head, int target) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        if (head == null)
            return ans;

        Node left = head;
        Node right = head;

        // Move right to last node
        while (right.next != null)
            right = right.next;

        while (left != right && right.next != left) {

            int sum = left.data + right.data;

            if (sum == target) {

                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(left.data);
                pair.add(right.data);

                ans.add(pair);

                left = left.next;
                right = right.prev;

            } else if (sum < target) {

                left = left.next;

            } else {

                right = right.prev;
            }
        }

        return ans;
    }
}
