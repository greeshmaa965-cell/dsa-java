class Solution {
    public int maxSubArray(int[] nums) 
    {
    //    int  max=0;int sum;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         sum=0;
    //         for(int j=i;j<nums.length;j++)
    //         {
    //             sum=sum+nums[j];
    //             if(sum>max)
    //         {
    //             max=sum;
    //         }
    //         }
            
    //     }
    //     return max;

    int sum=0;int max=nums[0];
    for(int i=0;i<nums.length;i++)
    {
        
        sum=sum+nums[i];
        
        
        
            if(sum>max)
            {
                max=sum;
            }
        if(sum<0)
        {
            sum=0;
        }

    }
    return max;
    }
}
