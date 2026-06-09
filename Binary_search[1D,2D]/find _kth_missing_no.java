////////////////////////////////////////////////////////Brute sol///////////////////////////////////////////////////////////////////////////
class Solution {

    public int findKthPositive(int[] arr, int k) {

        int current = 1;
        int i = 0;

        while(k > 0) {

            if(i < arr.length && arr[i] == current) {
                i++;
            } else {
                k--;
                if(k == 0) {
                    return current;
                }
            }

            current++;
        }

        return -1;
    }
}

///////////////////////////////////////////////////////////////better solution//////////////////////////////////////////////////////////////////////////////////////
class Solution {

    public int findKthPositive(int[] arr, int k) {

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] <= k) {
                k++;
            } else {
                break;
            }
        }

        return k;
    }
}

////////////////////////////////////////////////////////////////optimal solution/////////////////////////////////////////////////////////////////////////////////////
class Solution {

    public int findKthPositive(int[] arr, int k) {

        int low = 0;
        int high = arr.length - 1;

        while(low <= high) {

            int mid = low + (high - low) / 2;

            int missing = arr[mid] - (mid + 1);

            if(missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return low + k;
    }
}
