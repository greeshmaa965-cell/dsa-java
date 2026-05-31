class Solution {

    public int findKRotation(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        int minIndex = 0;

        while(low <= high) {

            // already sorted
            if(nums[low] <= nums[high]) {

                if(nums[low] < nums[minIndex]) {
                    minIndex = low;
                }
                break;
            }

            int mid = low + (high - low) / 2;

            // left half sorted
            if(nums[low] <= nums[mid]) {

                if(nums[low] < nums[minIndex]) {
                    minIndex = low;
                }

                low = mid + 1;
            }

            // right half sorted
            else {

                if(nums[mid] < nums[minIndex]) {
                    minIndex = mid;
                }

                high = mid - 1;
            }
        }

        return minIndex;
    }
}
