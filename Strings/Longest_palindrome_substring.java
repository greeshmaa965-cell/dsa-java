///////////////////brute solution////////////////
class Solution {

    public String longestPalindrome(String s) {

        String ans = "";

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);

                if (isPalindrome(sub) && sub.length() > ans.length())
                    ans = sub;
            }
        }

        return ans;
    }

    public boolean isPalindrome(String str) {

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {

            if (str.charAt(left) != str.charAt(right))
                return false;

            left++;
            right--;
        }

        return true;
    }
}
////////////////////optimal approach///////////////
class Solution {

    public String longestPalindrome(String s) {

        if (s == null || s.length() < 2)
            return s;

        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {

            int len1 = expand(s, i, i);       // Odd length
            int len2 = expand(s, i, i + 1);   // Even length

            int len = Math.max(len1, len2);

            if (len > end - start + 1) {

                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }

        return s.substring(start, end + 1);
    }

    private int expand(String s, int left, int right) {

        while (left >= 0 &&
               right < s.length() &&
               s.charAt(left) == s.charAt(right)) {

            left--;
            right++;
        }

        return right - left - 1;
    }
}
