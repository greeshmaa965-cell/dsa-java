class Solution {
    public int longestSubarray(int[] nums) 
    
    {
        int left=0;int maxlen=0;int countzero=0;
        for(int right=0;right<nums.length;right++)
        {
            if(nums[right]==0)
            {
                countzero++;
            }
           while(countzero > 1)
{
           if(nums[left] == 0)
      {
        countzero--;
      }

       left++;
}
            
          maxlen=Math.max(maxlen,right-left);
        }
      
        return maxlen;
    }
}
