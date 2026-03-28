class Solution {
    public int[] rearrangeArray(int[] nums) 
    {
        // int n = nums.length;

        // int[] pos = new int[n/2];
        // int[] neg = new int[n/2];

        // int p = 0, q = 0;

        // // Step 1: Separate positives and negatives
        // for(int i = 0; i < n; i++)
        // {
        //     if(nums[i] > 0)
        //     {
        //         pos[p++] = nums[i];
        //     }
        //     else
        //     {
        //         neg[q++] = nums[i];
        //     }
        // }

        // // Step 2: Merge alternately
        // int[] result = new int[n];
        // int i = 0, j = 0, k = 0;

        // while(i < p && j < q)
        // {
        //     result[k++] = pos[i++]; // positive
        //     result[k++] = neg[j++]; // negative
        // }

        // return result;




        int posIndex=0;
        int negIndex=1;
        int result[]=new int [nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
            {
                 result[posIndex]=nums[i];
                 posIndex= posIndex+2;
            }
            else{
                result[negIndex]=nums[i];
                negIndex=negIndex+2;
            }
        }
        return result;
    }
}
