import java.util.*;

class Solution {

    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(nums, 0, new ArrayList<>(), ans);

        return ans;
    }

    static void solve(int[] nums, int index,
                      List<Integer> current,
                      List<List<Integer>> ans) {

        // Base case
        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // Take the element
        current.add(nums[index]);

        solve(nums, index + 1, current, ans);

        // Backtrack
        current.remove(current.size() - 1);

        // Don't take the element
        solve(nums, index + 1, current, ans);
    }
}
