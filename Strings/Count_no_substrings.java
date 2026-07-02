/////////////////////brute solution/////////////
class Solution {
    public int countSubstrings(String s) {

        int count = 0;

        for (int i = 0; i < s.length(); i++) {

            for (int j = i; j < s.length(); j++) {

                String sub = s.substring(i, j + 1);
                count++;
            }
        }

        return count;
    }
}
//////////////////////optimal solution/////////////////
class Solution {
    public int countSubstrings(String s) {

        int n = s.length();

        return n * (n + 1) / 2;
    }
}
