class Solution {
    public int characterReplacement(String s, int k) {

        int left = 0;
        int maxFreq = 0;
        int maxLen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < s.length(); right++) {

            // Add right character
            map.put(
                s.charAt(right),
                map.getOrDefault(s.charAt(right), 0) + 1
            );

            // Find highest frequency
            maxFreq = 0;

            for (int freq : map.values()) {
                maxFreq = Math.max(maxFreq, freq);
            }

            // Number of characters we need to replace
            int changes = (right - left + 1) - maxFreq;

            // Invalid window
            while (changes > k) {

                map.put(
                    s.charAt(left),
                    map.get(s.charAt(left)) - 1
                );

                left++;
                for (int freq : map.values()) {
                maxFreq = Math.max(maxFreq, freq);
            }


                changes = (right - left + 1) - maxFreq;
            }

            // Valid window
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}
