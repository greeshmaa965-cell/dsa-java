import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        solve(candidates, 0, target, new ArrayList<>(), ans);

        return ans;
    }

    static void solve(int[] candidates, int index, int target,
                      List<Integer> current,
                      List<List<Integer>> ans) {

        // Target reached
        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        // No candidates left
        if (index == candidates.length) {
            return;
        }

        // Take current element
        if (candidates[index] <= target) {

            current.add(candidates[index]);

            // Stay at same index because repetition is allowed
            solve(candidates, index,
                  target - candidates[index],
                  current, ans);

            // Backtrack
            current.remove(current.size() - 1);
        }

        // Don't take current element
        solve(candidates, index + 1,
              target, current, ans);
    }
}
