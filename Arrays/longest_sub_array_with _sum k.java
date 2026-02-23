                        /*Brutesolution
class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int maxLen = 0;

        for(int i = 0; i < n; i++) {
            int sum = 0;

            for(int j = i; j < n; j++) {
                sum += nums[j];

                if(sum == k) {
                    int len = j - i + 1;
                    maxLen = Math.max(maxLen, len);
                }
            }
        }

        return maxLen;
    }
}*/
                                                     //optimal solution using prefixsum+hashmaps
import java.util.*;

class Solution {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int prefixSum = 0;
        int maxLen = 0;
        
        map.put(0, -1);   // important
        
        for(int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];
            
            if(map.containsKey(prefixSum - k)) {
                int len = i - map.get(prefixSum - k);
                maxLen = Math.max(maxLen, len);
            }
            
            if(!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }
        
        return maxLen;
    }
}
