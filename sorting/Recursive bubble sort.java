class Solution {

    public int[] bubbleSort(int[] nums) {

        sort(nums, nums.length);

        return nums;
    }

    public void sort(int[] nums, int n) {

        // Base condition
        if(n == 1) {
            return;
        }

        // One pass of bubble sort
        for(int i = 0; i < n - 1; i++) {

            if(nums[i] > nums[i + 1]) {

                // Swap
                int temp = nums[i];
                nums[i] = nums[i + 1];
                nums[i + 1] = temp;
            }
        }

        // Recursive call for remaining array
        sort(nums, n - 1);
    }
}
