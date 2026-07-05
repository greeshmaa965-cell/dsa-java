//////////////////////Brute solution//////////////
class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {

            StringBuilder temp = new StringBuilder(words[i]);
            ans.append(temp.reverse());

            if (i != words.length - 1)
                ans.append(" ");
        }

        return ans.toString();
    }
}
////////////////////optimal solution///////////////////
class Solution {
    public String reverseWords(String s) {

        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            int start = i;

            while (i < s.length() && s.charAt(i) != ' ')
                i++;

            for (int j = i - 1; j >= start; j--)
                ans.append(s.charAt(j));

            if (i < s.length())
                ans.append(" ");

            i++;
        }

        return ans.toString();
    }
}
