// class Solution {
//     public int maxProduct(int[] nums) 
//     {
//        int  max=nums[0];
//         int product;
//         for(int i=0;i<nums.length-1;i++)
//         {
//             product=nums[i];
//             for(int j=i+1;j<nums.length-1;j++)
//             {
//                 product=product*nums[j];
//                 if(product>max)
//                 {
//                    max=product;
//                 }
//             }
//         }
//         return max;
//     }
// }

//////////////////////////////////////////////optimal solution/////////////////////////////////////////////////////////////////////////////////////////////////////
class Solution {

    public int maxProduct(int[] nums) {
        int currMax = nums[0];
        int currMin = nums[0];
        int ans = nums[0];
        for(int i = 1; i < nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(
                        nums[i],
                        Math.max(currMax * nums[i],
                                 currMin * nums[i])
                      );
            currMin = Math.min(
                        nums[i],
                        Math.min(temp * nums[i],
                                 currMin * nums[i])
                      );
            ans = Math.max(ans, currMax);
        }

        return ans;
    }
}
