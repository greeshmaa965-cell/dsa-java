///////////////Brute solution//////////
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();

        int count = 0;
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                count++;
            else
                count--;

            if (count == 0) {
                ans.append(s.substring(start + 1, i));
                start = i + 1;
            }
        }

        return ans.toString();
    }
}
//////////////optimal solution/////////////
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int open = 0;

        for(char ch : s.toCharArray()) {

            if(ch == '(') {
                if(open > 0)
                    ans.append(ch);
                open++;
            }
            else {
                open--;
                if(open > 0)
                    ans.append(ch);
            }
        }

        return ans.toString();
    }
}
