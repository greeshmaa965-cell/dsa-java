///////////brute solution//////////////
class Solution {

    public int kthElement(int[] arr1, int[] arr2, int k) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, idx = 0;

        while(i < n1 && j < n2) {

            if(arr1[i] <= arr2[j]) {
                merged[idx++] = arr1[i++];
            } else {
                merged[idx++] = arr2[j++];
            }
        }

        while(i < n1) {
            merged[idx++] = arr1[i++];
        }

        while(j < n2) {
            merged[idx++] = arr2[j++];
        }

        return merged[k - 1];
    }
}
////////////better solution//////////////////
class Solution {

    public int kthElement(int[] arr1, int[] arr2, int k) {

        int i = 0, j = 0;
        int count = 0;

        while(i < arr1.length && j < arr2.length) {

            if(arr1[i] <= arr2[j]) {

                count++;

                if(count == k) {
                    return arr1[i];
                }

                i++;
            }
            else {

                count++;

                if(count == k) {
                    return arr2[j];
                }

                j++;
            }
        }

        while(i < arr1.length) {

            count++;

            if(count == k) {
                return arr1[i];
            }

            i++;
        }

        while(j < arr2.length) {

            count++;

            if(count == k) {
                return arr2[j];
            }

            j++;
        }

        return -1;
    }
}
////////////optimal solution/////////////////
class Solution {

    public int kthElement(int[] arr1, int[] arr2, int k) {

        if(arr1.length > arr2.length) {
            return kthElement(arr2, arr1, k);
        }

        int n1 = arr1.length;
        int n2 = arr2.length;

        int low = Math.max(0, k - n2);
        int high = Math.min(k, n1);

        while(low <= high) {

            int cut1 = low + (high - low) / 2;
            int cut2 = k - cut1;

            int l1 = (cut1 == 0)
                    ? Integer.MIN_VALUE
                    : arr1[cut1 - 1];

            int l2 = (cut2 == 0)
                    ? Integer.MIN_VALUE
                    : arr2[cut2 - 1];

            int r1 = (cut1 == n1)
                    ? Integer.MAX_VALUE
                    : arr1[cut1];

            int r2 = (cut2 == n2)
                    ? Integer.MAX_VALUE
                    : arr2[cut2];

            if(l1 <= r2 && l2 <= r1) {

                return Math.max(l1, l2);

            }
            else if(l1 > r2) {

                high = cut1 - 1;

            }
            else {

                low = cut1 + 1;
            }
        }

        return -1;
    }
}
