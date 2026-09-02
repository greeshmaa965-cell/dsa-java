class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        int[] result = new int[nums.length];
        int index = 0;

        // Put elements smaller than pivot
        for (int num : nums) {
            if (num < pivot) {
                result[index] = num;
                index++;
            }
        }

        // Put elements equal to pivot
        for (int num : nums) {
            if (num == pivot) {
                result[index] = num;
                index++;
            }
        }

        // Put elements greater than pivot
        for (int num : nums) {
            if (num > pivot) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }
}
