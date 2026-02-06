class Solution {
    public int majorityElement(int[] nums) 
    {
                        /*Brute solution*/
    //     int n=(int)Math.floor(nums.length/2);
    //     boolean saw =false;
    //     for(int i=0;i<nums.length;i++)
    //     {
    //         saw=false;int count=0;
    //         for(int k=0;k<i;k++)
    //         {
    //             if(nums[k]==nums[i])
    //             {
    //                 saw=true;
    //                continue;
    //             }
    //         }
           
    //         for(int j=0;j<nums.length;j++)
    //         {
    //            if(nums[i]==nums[j])
    //            {
    //             count++;
    //            }
    //         }
    //         if(count>n)
    //     {
    //         return nums[i];
    //     }
    //     }
    //    return -1; 
                 /*Using Hash maps*/

    //    int n=nums.length/2;
    //    HashMap <Integer,Integer>map=new HashMap<>();
    //    for(int i=0;i<nums.length;i++)
    //    {
    //     if(map.containsKey(nums[i]))
    //     {
    //         map.put(nums[i],map.get(nums[i])+1);
    //     }
    //     else
    //     {
    //         map.put(nums[i],1);
    //     }
    //     if (map.get(nums[i]) > n / 2) {
    //             return nums[i];
    //         }
    //    }
    //    return -1;

                     /*bayer moore*/
                     int candidate = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }

            if (count == 0) {
                candidate = nums[i];
                count = 1;
            }
        }

        return candidate;


    }
}
