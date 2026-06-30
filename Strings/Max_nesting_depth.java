////////////////////Brute solution///////////////.
class Solution {
    public int maxDepth(String s) {

        int maxDepth = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                int depth = 0;

                for (int j = i; j < s.length(); j++) {

                    if (s.charAt(j) == '(')
                        depth++;
                    else if (s.charAt(j) == ')')
                        depth--;

                    maxDepth = Math.max(maxDepth, depth);

                    if (depth == 0)
                        break;
                }
            }
        }

        return maxDepth;
    }
}
/////////////////////////optimal solution///////////////
class Solution {
    public int maxDepth(String s) {

        int currentDepth = 0;
        int maxDepth = 0;

        for (char ch : s.toCharArray()) {

            if (ch == '(') {
                currentDepth++;
                maxDepth = Math.max(maxDepth, currentDepth);
            } 
            else if (ch == ')') {
                currentDepth--;
            }
        }

        return maxDepth;
    }
}
