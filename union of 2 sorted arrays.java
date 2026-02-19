                                   /*Brute force
import java.util.*;

class Solution {
    public int[] union(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums1)
            set.add(num);

        for (int num : nums2)
            set.add(num);

        int[] result = new int[set.size()];
        int i = 0;

        for (int num : set)
            result[i++] = num;

        Arrays.sort(result);  // needed because HashSet is unordered

        return result;
    }
}*/

                                          /*OPtimal solution*/
import java.util.*;

class Solution {
    public int[] union(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;

        int i = 0, j = 0;

        ArrayList<Integer> result = new ArrayList<>();

        while (i < n && j < m) {

            if (nums1[i] == nums2[j]) {
                if (result.isEmpty() || result.get(result.size()-1) != nums1[i])
                    result.add(nums1[i]);
                i++;
                j++;
            }

            else if (nums1[i] < nums2[j]) {
                if (result.isEmpty() || result.get(result.size()-1) != nums1[i])
                    result.add(nums1[i]);
                i++;
            }

            else {
                if (result.isEmpty() || result.get(result.size()-1) != nums2[j])
                    result.add(nums2[j]);
                j++;
            }
        }

        // remaining elements
        while (i < n) {
            if (result.isEmpty() || result.get(result.size()-1) != nums1[i])
                result.add(nums1[i]);
            i++;
        }

        while (j < m) {
            if (result.isEmpty() || result.get(result.size()-1) != nums2[j])
                result.add(nums2[j]);
            j++;
        }

        // convert to array
        int[] ans = new int[result.size()];
        for (int k = 0; k < result.size(); k++)
            ans[k] = result.get(k);

        return ans;
    }
}

