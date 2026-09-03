import java.util.*;

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] need = new int[26];
        int[] window = new int[26];

        // Frequency of characters in s1
        for (int i = 0; i < s1.length(); i++) {
            need[s1.charAt(i) - 'a']++;
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            // Add right character
            window[s2.charAt(right) - 'a']++;

            // When window reaches s1's length
            if (right - left + 1 == s1.length()) {

                // Same frequencies = permutation found
                if (Arrays.equals(need, window)) {
                    return true;
                }

                // Remove left character
                window[s2.charAt(left) - 'a']--;
                left++;
            }
        }

        return false;
    }
}
