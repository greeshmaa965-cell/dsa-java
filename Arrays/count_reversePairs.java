/*class Solution {
    public int reversePairs(int[] nums) 
    {
        int count=0;
        for (int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {

                if(nums[i]>2*nums[j])
                {
                    count++;
                }
            }
        }
        return count;
    }
}*/




///////////////////////////////////////////optimal solution/////////////////////////////////////////////////////////////////////////////////////////
class Solution {

    public int reversePairs(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);
    }

    int mergeSort(int[] arr, int low, int high) {

        // Base condition
        if(low >= high) {
            return 0;
        }

        // Find middle
        int mid = (low + high) / 2;

        int count = 0;

        // Solve left half
        count += mergeSort(arr, low, mid);

        // Solve right half
        count += mergeSort(arr, mid + 1, high);

        // Count reverse pairs
        count += countPairs(arr, low, mid, high);

        // Merge both halves
        merge(arr, low, mid, high);

        return count;
    }

    int countPairs(int[] arr, int low, int mid, int high) {

        int right = mid + 1;

        int count = 0;

        for(int i = low; i <= mid; i++) {

            while(right <= high &&
                  arr[i] > 2L * arr[right]) {

                right++;
            }

            count += (right - (mid + 1));
        }

        return count;
    }

    void merge(int[] arr, int low, int mid, int high) {

        int[] temp = new int[high - low + 1];

        int left = low;

        int right = mid + 1;

        int k = 0;

        while(left <= mid && right <= high) {

            if(arr[left] <= arr[right]) {

                temp[k] = arr[left];
                left++;
            }
            else {

                temp[k] = arr[right];
                right++;
            }

            k++;
        }

        while(left <= mid) {

            temp[k] = arr[left];
            left++;
            k++;
        }

        while(right <= high) {

            temp[k] = arr[right];
            right++;
            k++;
        }

        for(int i = low; i <= high; i++) {

            arr[i] = temp[i - low];
        }
    }
}
