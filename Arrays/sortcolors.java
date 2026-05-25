class Solution {
    public void sortColors(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]>nums[j])
                {
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                }
            }
        }
        
    }
}

//dutch flag algorithm

class Solution {

    public void sortColors(int[] nums) 
    {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while(mid <= high)
        {
            // Case 1 -> 0
            if(nums[mid] == 0)
            {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;

                low++;
                mid++;
            }

            // Case 2 -> 1
            else if(nums[mid] == 1)
            {
                mid++;
            }

            // Case 3 -> 2
            else
            {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;

                high--;
            }
        }
    }
}
