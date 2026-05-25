class Solution {
    public int lowerBound(int[] nums, int x) 
    {
       for(int i=0;i<nums.length;i++)
       {
         if(nums[i]>=x)
         {
            return i;
            
         }
       }
       return nums.length;
    }
}
