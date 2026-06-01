class Solution {

    public int singleNonDuplicate(int[] nums) {

        int low = 0;
        int high = nums.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            // Single element found
            if((mid == 0 || nums[mid] != nums[mid - 1]) &&
               (mid == nums.length - 1 || nums[mid] != nums[mid + 1])) {
                return nums[mid];
            }

            // mid is even
            if(mid % 2 == 0) {

                if(nums[mid] == nums[mid + 1]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }

            // mid is odd
            else {

                if(nums[mid] == nums[mid - 1]) {
                    low = mid + 1;
                }
                else {
                    high = mid - 1;
                }
            }
        }

        return -1;
    }
}
