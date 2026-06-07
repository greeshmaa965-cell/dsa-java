////////////////////Brute force////////////////
class Solution {

    public int smallestDivisor(int[] nums, int threshold) {

        int max = 0;

        for(int num : nums) {
            max = Math.max(max, num);
        }

        for(int divisor = 1; divisor <= max; divisor++) {

            int sum = 0;

            for(int num : nums) {
                sum += (num + divisor - 1) / divisor;
            }

            if(sum <= threshold) {
                return divisor;
            }
        }

        return -1;
    }
}

//////////////////////optimal solution/////////////////////
class Solution {

    public int smallestDivisor(int[] nums, int threshold) {

        int low = 1;
        int high = 0;

        for(int num : nums) {
            high = Math.max(high, num);
        }

        int ans = high;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int sum = 0;

            for(int num : nums) {
                sum += (num + mid - 1) / mid;
            }

            if(sum <= threshold) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return ans;
    }
}
