class Solution {
    public int upperBound(int[] nums, int x) 
    {
       for(int i=0;i<nums.length;i++)
       {
          if(nums[i]>x)
          {
            return i;
          }
       }
       return nums.length;
    }
}


//////////////////////////////////////////////////////optimal solution///////////////////////////////////////////////////////////////////
class Solution {

    public int upperBound(int[] arr, int target)
    {
        int low = 0;
        int high = arr.length - 1;

        int ans = arr.length;

        while(low <= high)
        {
            int mid = low + (high - low) / 2;

            // possible answer
            if(arr[mid] > target)
            {
                ans = mid;
                high = mid - 1;
            }

            else
            {
                low = mid + 1;
            }
        }

        return ans;
    }
}
