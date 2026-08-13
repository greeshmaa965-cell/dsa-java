import java.util.*;

class Solution {

    public List<String> generateParenthesis(int n) {

        List<String> result = new ArrayList<>();

        generate("", 0, 0, n, result);

        return result;
    }

    public void generate(String str, int open, int close,
                         int n, List<String> result) {

        // Base case
        if (open == n && close == n) {
            result.add(str);
            return;
        }

        // Add '('
        if (open < n) {
            generate(str + "(", open + 1, close, n, result);
        }

        // Add ')'
        if (close < open) {
            generate(str + ")", open, close + 1, n, result);
        }
    }
}
