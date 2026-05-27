class Solution {

    public int count(int[] arr, int target) {

        int first = firstOccurrence(arr, target);

        // target not found
        if(first == -1) {
            return 0;
        }

        int last = lastOccurrence(arr, target);

        return last - first + 1;
    }

    // Find first occurrence
    public int firstOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                ans = mid;
                high = mid - 1; // move left
            }

            else if(arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    // Find last occurrence
    public int lastOccurrence(int[] arr, int target) {

        int low = 0;
        int high = arr.length - 1;

        int ans = -1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            if(arr[mid] == target) {
                ans = mid;
                low = mid + 1; // move right
            }

            else if(arr[mid] < target) {
                low = mid + 1;
            }

            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
