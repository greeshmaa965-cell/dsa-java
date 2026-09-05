class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {

        HashMap<Integer, Integer> map = new HashMap<>();

        int[] small;int[] larger;

        if (nums1.length > nums2.length) {
            small = nums2;
            larger = nums1;
        } else {
            small = nums1;
            larger = nums2;
        }

        int[] ans = new int[small.length];
        int p = 0;

        for (int i = 0; i < small.length; i++) {
            map.put(small[i], map.getOrDefault(small[i], 0) + 1);
        }

        for (int i = 0; i < larger.length; i++) {

            if (map.containsKey(larger[i]) && map.get(larger[i]) > 0) {

                ans[p] = larger[i];
                p++;

                 map.remove(larger[i]); 
            }
        }
     return Arrays.copyOf(ans, p);
        
    }
}
