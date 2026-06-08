/////////////////////Brute solution//////////////////
class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for(int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        for(int cap = low; cap <= high; cap++) {

            int requiredDays = 1;
            int load = 0;

            for(int w : weights) {

                if(load + w > cap) {
                    requiredDays++;
                    load = w;
                }
                else {
                    load += w;
                }
            }

            if(requiredDays <= days) {
                return cap;
            }
        }

        return -1;

      ///////////////////////optimal solution/////////////////////
      class Solution {

    public int shipWithinDays(int[] weights, int days) {

        int low = 0;
        int high = 0;

        for(int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        int ans = high;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int requiredDays = 1;
            int load = 0;

            for(int w : weights) {

                if(load + w > mid) {

                    requiredDays++;
                    load = w;

                } else {

                    load += w;
                }
            }

            if(requiredDays <= days) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return ans;
    }
      }
    }
}
