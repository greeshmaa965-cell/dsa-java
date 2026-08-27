class Solution {
    public int minOperations(int[] nums, int x) 
    {
        int sum = 0;
        int maxlen = -1;

        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
        }

        int keptsum = sum - x;

        if(x > sum)
        {
            return -1;
        }

        int left = 0;
        int checksum = 0;

        for(int right = 0; right < nums.length; right++)
        {
            checksum += nums[right];

            while(checksum > keptsum)
            {
                checksum -= nums[left];
                left++;
            }

            if(checksum == keptsum)
            {
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }

        if(maxlen == -1)
        {
            return -1;
        }

        return nums.length - maxlen;
    }
}
