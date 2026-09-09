class Solution {
    public int longestMountain(int[] arr) {

        int i = 1;
        int maxcount = 0;

        while (i < arr.length - 1) {

            // Check whether i is a peak
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {

                int p1 = i - 1;
                int p2 = i + 1;

                // Move left
                while (p1 > 0 && arr[p1 - 1] < arr[p1]) {
                    p1--;
                }

                // Move right
                while (p2 < arr.length - 1 && arr[p2] > arr[p2 + 1]) {
                    p2++;
                }

                int count = p2 - p1 + 1;

                maxcount = Math.max(maxcount, count);
            }

            i++;
        }

        return maxcount;
    }
}
