///////////Brute sol/////////

class 

  Solution {

    public int paintersPartition(int[] boards, int k) {

        int low = 0;
        int high = 0;

        for(int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        for(int maxWork = low; maxWork <= high; maxWork++) {

            int painters = 1;
            int work = 0;

            for(int board : boards) {

                if(work + board <= maxWork) {

                    work += board;

                } else {

                    painters++;
                    work = board;
                }
            }

            if(painters <= k) {
                return maxWork;
            }
        }

        return -1;
    }
}

//////////////////////optimal sol//////////////////////
class Solution {

    public int paintersPartition(int[] boards, int k) {

        int low = 0;
        int high = 0;

        for(int board : boards) {
            low = Math.max(low, board);
            high += board;
        }

        int ans = high;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int painters = 1;
            int work = 0;

            for(int board : boards) {

                if(work + board <= mid) {

                    work += board;

                } else {

                    painters++;
                    work = board;
                }
            }

            if(painters <= k) {

                ans = mid;
                high = mid - 1;

            } else {

                low = mid + 1;
            }
        }

        return ans;
    }
}
