class Solution {

    public boolean checkSubsequenceSum(int[] arr, int k) {
        return check(arr, 0, 0, k);
    }

    static boolean check(int[] arr, int index, int sum, int k) {

        // Base case
        if (index == arr.length) {
            return sum == k;
        }

        // Take the current element
        boolean take = check(
            arr,
            index + 1,
            sum + arr[index],
            k
        );

        // Don't take the current element
        boolean notTake = check(
            arr,
            index + 1,
            sum,
            k
        );

        // If either branch gives the required sum
        return take || notTake;
    }
}
