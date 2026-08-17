class Solution {

    public int countSubsequences(int[] arr, int k) {
        return count(arr, 0, 0, k);
    }

    static int count(int[] arr, int index, int sum, int k) {

        // Base case
        if (index == arr.length) {

            if (sum == k) {
                return 1;
            }

            return 0;
        }

        // Take current element
        int take = count(
            arr,
            index + 1,
            sum + arr[index],
            k
        );

        // Don't take current element
        int notTake = count(
            arr,
            index + 1,
            sum,
            k
        );

        // Total valid subsequences
        return take + notTake;
    }
}
