class Solution
 {
    public double findMaxAverage(int[] nums, int k)
    {
                     /*Brute Force*/
    //     double max=0.0;
    //     for(int i=0;i<nums.length-k;i++)
    //     {
           
    //        int sum=0;
    //         for(int j=i;j<i+k;j++)
    //         {
    //             sum=sum+nums[j];
    //         }
             
    //         if(max<sum)
    //         {
    //             max=sum;
    //         }

    //     }
    //    return (double)max/(double)k;


                            /*OPTIMIZED SOLUTION*/
        int  winsum=0;
        for(int i=0;i<k;i++)
        {
            winsum=winsum+nums[i];
        }
        double maxsum=winsum;
        for(int i=k;i<nums.length;i++)
        {
            winsum=winsum+nums[i]-nums[i-k];
            maxsum=Math.max(winsum,maxsum);
        }
        return (double)maxsum/k;

    }
    
}
