class Solution {

    public int[] getFloorAndCeil(int[] nums, int x) {

        int low = 0;
        int high = nums.length - 1;

        int floor = -1;
        int ceil = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            // Possible floor
            if(nums[mid] <= x) {
                floor = nums[mid];
                low = mid + 1;
            }

            // Possible ceil
            else {
                ceil = nums[mid];
                high = mid - 1;
            }
        }

        // If exact element exists
        if(floor == x) {
            ceil = x;
        }

        return new int[]{floor, ceil};
    }
}
