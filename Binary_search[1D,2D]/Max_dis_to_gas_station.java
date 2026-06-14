//////////////////////////brute/////////
class Solution {

    public double findSmallestMaxDist(int[] stations, int k) {

        int n = stations.length;

        int[] howMany = new int[n - 1];

        for(int gas = 1; gas <= k; gas++) {

            double maxSection = -1;
            int maxIndex = -1;

            for(int i = 0; i < n - 1; i++) {

                double diff = stations[i + 1] - stations[i];

                double sectionLength =
                        diff / (howMany[i] + 1);

                if(sectionLength > maxSection) {

                    maxSection = sectionLength;
                    maxIndex = i;
                }
            }

            howMany[maxIndex]++;
        }

        double ans = 0;

        for(int i = 0; i < n - 1; i++) {

            double diff = stations[i + 1] - stations[i];

            ans = Math.max(ans,
                    diff / (howMany[i] + 1));
        }

        return ans;
    }
}

/////////////////////////optimal solution///////////////
class Solution {

    public double findSmallestMaxDist(int[] stations, int k) {

        double low = 0;
        double high = 0;

        for(int i = 0; i < stations.length - 1; i++) {
            high = Math.max(high,
                    stations[i + 1] - stations[i]);
        }

        while(high - low > 1e-6) {

            double mid = (low + high) / 2.0;

            int count = 0;

            for(int i = 0; i < stations.length - 1; i++) {

                double gap =
                        stations[i + 1] - stations[i];

                count += (int)(gap / mid);

                if(gap % mid == 0) {
                    count--;
                }
            }

            if(count > k) {

                low = mid;

            } else {

                high = mid;
            }
        }

        return high;
    }
}
