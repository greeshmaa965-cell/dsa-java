/////////////brute solution////////////////
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] arr = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while(i < n1 && j < n2) {

            if(nums1[i] <= nums2[j]) {
                arr[k++] = nums1[i++];
            } else {
                arr[k++] = nums2[j++];
            }
        }

        while(i < n1) {
            arr[k++] = nums1[i++];
        }

        while(j < n2) {
            arr[k++] = nums2[j++];
        }

        int n = n1 + n2;

        if(n % 2 == 1) {
            return arr[n/2];
        }

        return (arr[n/2] + arr[n/2 - 1]) / 2.0;


//////////////////////////optimal sol/////////////
class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if(nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int n1 = nums1.length;
        int n2 = nums2.length;

        int low = 0;
        int high = n1;

        while(low <= high) {

            int cut1 = low + (high - low) / 2;

            int cut2 = (n1 + n2 + 1) / 2 - cut1;

            int l1 = (cut1 == 0)
                    ? Integer.MIN_VALUE
                    : nums1[cut1 - 1];

            int l2 = (cut2 == 0)
                    ? Integer.MIN_VALUE
                    : nums2[cut2 - 1];

            int r1 = (cut1 == n1)
                    ? Integer.MAX_VALUE
                    : nums1[cut1];

            int r2 = (cut2 == n2)
                    ? Integer.MAX_VALUE
                    : nums2[cut2];

            if(l1 <= r2 && l2 <= r1) {

                if((n1 + n2) % 2 == 1) {

                    return Math.max(l1, l2);

                } else {

                    return (Math.max(l1, l2)
                            + Math.min(r1, r2))
                            / 2.0;
                }
            }

            else if(l1 > r2) {

                high = cut1 - 1;

            } else {

                low = cut1 + 1;
            }
        }

        return 0;
    }
}
