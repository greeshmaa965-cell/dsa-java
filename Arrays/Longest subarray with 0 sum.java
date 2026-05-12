import java.util.*;

class Solution {

    int maxLen(int arr[], int n)
    {
        // prefixSum -> index
        HashMap<Integer,Integer> map = new HashMap<>();

        int sum = 0;

        int maxLength = 0;


        for(int i = 0; i < n; i++)
        {
            // Add current element
            sum += arr[i];


            // If total sum becomes 0
            // subarray from 0 to i
            if(sum == 0)
            {
                maxLength = i + 1;
            }


            // If same prefix sum seen before
            if(map.containsKey(sum))
            {
                int length = i - map.get(sum);

                maxLength =
                    Math.max(maxLength, length);
            }

            // Store first occurrence only
            else
            {
                map.put(sum, i);
            }
        }

        return maxLength;
    }
}
