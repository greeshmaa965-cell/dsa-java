class Solution {

    public int search(int[] nums, int k)
    {
        int low = 0;
        int high = nums.length - 1;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            // target found
            if(nums[mid] == k)
            {
                return mid;
            }

            // LEFT HALF SORTED
            if(nums[low] <= nums[mid])
            {
                // target lies in left half
                if(nums[low] <= k && k < nums[mid])
                {
                    high = mid - 1;
                }

                else
                {
                    low = mid + 1;
                }
            }

            // RIGHT HALF SORTED
            else
            {
                // target lies in right half
                if(nums[mid] < k && k <= nums[high])
                {
                    low = mid + 1;
                }

                else
                {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
