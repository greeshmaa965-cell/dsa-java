// class Solution {
//     public int findMaxConsecutiveOnes(int[] nums)
//     {
//       int max=0;
//       for(int i=0;i<nums.length;i++)
//       {
        
//         if(nums[i]==1)
//         {
//             int count=0;
//             for(int j=i;j<nums.length;j++)
//             {
//                 if(nums[j]==1)
//                 {
//                     count++;
//                 }
//                 else{
//                     break;
//                 }
//             }
//             max=Math.max(max,count);
//         }
//       }
//       return max;
//     }
// }
                           /*OPTIMAL SOLUTION*/
                           class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {
        int count = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++)
        {
            if (nums[i] == 1)
            {
                count++;
                max = Math.max(max, count);
            }
            else
            {
                count = 0;
            }
        }

        return max;
    }
}
