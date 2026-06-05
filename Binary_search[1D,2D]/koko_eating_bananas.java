/////////////////////////////////////brute force?////////////////////////////////////////////////////////////////

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int max = 0;

        for(int pile : piles) {
            max = Math.max(max, pile);
        }

        // Try every speed from 1 to max
        for(int speed = 1; speed <= max; speed++) {

            long hours = 0;

            for(int pile : piles) {
                hours += (pile + speed - 1) / speed; // ceil(pile/speed)
            }

            if(hours <= h) {
                return speed;
            }
        }

        return -1;
    }
}


/////////////////////////////////////optimal solution////////////////////////////////////////////////////////////////////////////////////////////

class Solution {

    public int minEatingSpeed(int[] piles, int h) {

        int low = 1;
        int high = 0;

        // Find maximum pile
        for(int pile : piles) {
            high = Math.max(high, pile);
        }

        int ans = high;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            long hours = 0;

            // Calculate hours needed at speed = mid
            for(int pile : piles) {
                hours += (pile + mid - 1) / mid;
            }

            if(hours <= h) {

                ans = mid;      // valid speed found
                high = mid - 1; // try smaller speed

            } else {

                low = mid + 1;  // speed too slow
            }
        }

        return ans;
    }
}
