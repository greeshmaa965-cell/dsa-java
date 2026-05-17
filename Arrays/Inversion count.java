class Solution {

    public int inversionCount(int[] nums) {

        return mergeSort(nums, 0, nums.length - 1);
    }

    int mergeSort(int[] arr, int low, int high){

        int count = 0;

        if(low >= high){
            return count;
        }

        int mid = (low + high) / 2;

        count += mergeSort(arr, low, mid);

        count += mergeSort(arr, mid + 1, high);

        count += merge(arr, low, mid, high);

        return count;
    }

    int merge(int[] arr, int low, int mid, int high){

        int[] temp = new int[high - low + 1];

        int left = low;
        int right = mid + 1;

        int k = 0;

        int count = 0;

        while(left <= mid && right <= high){

            if(arr[left] <= arr[right]){

                temp[k++] = arr[left++];
            }
            else{

                temp[k++] = arr[right++];

                count += (mid - left + 1);
            }
        }

        while(left <= mid){
            temp[k++] = arr[left++];
        }

        while(right <= high){
            temp[k++] = arr[right++];
        }

        for(int i = low; i <= high; i++){

            arr[i] = temp[i - low];
        }

        return count;
    }
}
