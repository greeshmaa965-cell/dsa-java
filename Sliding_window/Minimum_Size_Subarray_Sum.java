class Solution {
    public int minSubArrayLen(int target, int[] nums)
    {
        int left=0;int maxsum=0;
        int minlen=Integer.MAX_VALUE;
        for(int right=0;right<nums.length;right++)
        {
            maxsum+=nums[right];
            while(maxsum>=target)
            {
                minlen=Math.min(minlen,right-left+1);
                maxsum-=nums[left];
                left++;
            }
         
            
        }
          if(minlen==Integer.MAX_VALUE)
            {
                return 0;
            }
            
        return minlen;
    }
}
