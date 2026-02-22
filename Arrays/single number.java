class Solution {
    public int singleNumber(int[] nums) 
    {

                                               //Brute solution
       /*int max_count;int single_num=0;
       for(int i=0;i<nums.length;i++)
       {
        max_count=0;
        for(int j=0;j<nums.length;j++)
        {
            if(nums[i]==nums[j])
            {
                max_count++;
            }
        }
        if(max_count==1)
        {
            single_num=nums[i];
        }
       }
       return single_num;


                                                           //Better solution
          HashMap<Integer,Integer>map=new HashMap<>();
          for(int i=0;i<nums.length;i++)
          {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
            

          }
          for(int num:nums)
          {
            if(map.get(num)==1)
            {
                return num;
            }
          }
         return -1;*/


                                                           //optimal solution
        int xor = 0;

        for (int num : nums)
            xor ^= num;

        return xor;
             
    }
}
