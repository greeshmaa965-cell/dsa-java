class Solution {
    public int[] selectionSort(int[] nums) 
    {
        for(int i = 0; i < nums.length - 1; i++)
        {
            int min = i;

            // Find index of smallest element
            for(int j = i + 1; j < nums.length; j++)
            {
                if(nums[j] < nums[min])
                {
                    min = j;
                }
            }

            // Swap
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }

        return nums;
    }
}
