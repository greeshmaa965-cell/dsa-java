class Solution {
    public boolean check(int[] nums) 
    {


                                    /*BRUTE SOLUTION*/
        /*int []b=Arrays.copyOf(nums,nums.length);
       Arrays.sort(nums);
       
       for(int x=0;x<nums.length;x++)
       {
        Boolean isMatch=true;
       for(int i=0;i<nums.length;i++)
       {
        if(b[i]!=nums[(i+x)%nums.length])
        {
            isMatch= false;
            break;
        }
       }
        if(isMatch)
       {
        return true;
       }
       
      
       }
    return false;*/


      
                 /*OPTIMIZED SOLUTION*/

      
        int count = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1) {
                return false;
            }
        }

        return true;
    

       
    }
}
