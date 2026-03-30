class Solution {
    public List<Integer> leaders(int[] nums) 
    {
        // int count; List<Integer> result = new ArrayList<>();
        // for (int i=0;i<nums.length;i++)
        // {
        //     count=0;
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]<nums[j])
        //         {
        //             count++;
        //         }
        //     }
        //     if(count==0)
        //     {
        //        result.add(nums[i]);
        //     }
        // }
        
        // return result;
        import java.util.*;

class Solution {
    public List<Integer> leaders(int[] nums) 
    {
        List<Integer> result = new ArrayList<>();

        int n = nums.length;

        int max = nums[n - 1];   // last element is always leader
        result.add(max);

        // traverse from right to left
        for(int i = n - 2; i >= 0; i--)
        {
            if(nums[i] > max)
            {
                max = nums[i];
                result.add(max);
            }
        }

        // reverse result to maintain original order
        Collections.reverse(result);

        return result;
    }
}
    }
}
