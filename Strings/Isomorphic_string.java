///////////////brute solution////////////////
class Solution {
    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length())
            return false;

        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < i; j++) {

                if (s.charAt(i) == s.charAt(j) &&
                    t.charAt(i) != t.charAt(j))
                    return false;

                if (s.charAt(i) != s.charAt(j) &&
                    t.charAt(i) == t.charAt(j))
                    return false;
            }
        }

        return true;
    }
}
////////////////optimal solution///////////////
class Solution {
    public boolean isIsomorphic(String s, String t) {

        int[] mapS = new int[256];
        int[] mapT = new int[256];

        for (int i = 0; i < s.length(); i++) {

            if (mapS[s.charAt(i)] != mapT[t.charAt(i)])
                return false;

            mapS[s.charAt(i)] = i + 1;
            mapT[t.charAt(i)] = i + 1;
        }

        return true;
    }
}
