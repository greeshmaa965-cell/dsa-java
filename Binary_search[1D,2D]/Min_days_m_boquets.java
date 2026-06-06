///////////////Brute solution//////////////////
class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m * k > bloomDay.length) {
            return -1;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }

        for(int day = min; day <= max; day++) {

            int bouquets = 0;
            int flowers = 0;

            for(int bloom : bloomDay) {

                if(bloom <= day) {

                    flowers++;

                    if(flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }
                }
                else {
                    flowers = 0;
                }
            }

            if(bouquets >= m) {
                return day;
            }
        }

        return -1;






      ///////////////////optimal solution///////////////////
      class Solution {

    public int minDays(int[] bloomDay, int m, int k) {

        if((long)m * k > bloomDay.length) {
            return -1;
        }

        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;

        for(int day : bloomDay) {
            low = Math.min(low, day);
            high = Math.max(high, day);
        }

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int bouquets = 0;
            int flowers = 0;

            for(int bloom : bloomDay) {

                if(bloom <= mid) {

                    flowers++;

                    if(flowers == k) {
                        bouquets++;
                        flowers = 0;
                    }

                } else {

                    flowers = 0;
                }
            }

            if(bouquets >= m) {

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
