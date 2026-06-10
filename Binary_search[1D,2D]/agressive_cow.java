///////////////////////////////////////////////////////////////brute solution?//////////////////////////////////////////////////////////////////////////////////
class Solution {

    public int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);

        int maxDist = stalls[stalls.length - 1] - stalls[0];

        int ans = 0;

        for(int dist = 1; dist <= maxDist; dist++) {

            int cows = 1;
            int last = stalls[0];

            for(int i = 1; i < stalls.length; i++) {

                if(stalls[i] - last >= dist) {
                    cows++;
                    last = stalls[i];
                }
            }

            if(cows >= k) {
                ans = dist;
            }
        }

        return ans;
    }
}





/////////////////////////////////////////////////////////////////////optimal solutio///////////////////////////////////////////////////////////////
class Solution {

    public int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);

        int low = 1;
        int high = stalls[stalls.length - 1] - stalls[0];

        int ans = 0;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int cows = 1;
            int last = stalls[0];

            for(int i = 1; i < stalls.length; i++) {

                if(stalls[i] - last >= mid) {
                    cows++;
                    last = stalls[i];
                }
            }

            if(cows >= k) {

                ans = mid;
                low = mid + 1;   // try bigger distance

            } else {

                high = mid - 1;
            }
        }

        return ans;
    }
}
