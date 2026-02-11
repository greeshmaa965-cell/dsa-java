class Solution {
    public int removeDuplicates(int[] nums)
     {

                           /*Brute solution
                           public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;

    int[] temp = new int[nums.length];
    int k = 0;

    temp[k++] = nums[0];

    for (int i = 1; i < nums.length; i++) {
        if (nums[i] != nums[i - 1]) {
            temp[k++] = nums[i];
        }
    }

    for (int i = 0; i < k; i++) {
        nums[i] = temp[i];
    }

    return k;
}*/

                        /*Bettersolution

    public int removeDuplicates(int[] nums) {
    Set<Integer> set = new LinkedHashSet<>();

    for (int num : nums) {
        set.add(num);
    }

    int k = 0;
    for (int num : set) {
        nums[k++] = num;
    }

    return k;
}*/


    if (nums.length == 0) return 0;

    int i = 0;

    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {
            i++;
            nums[i] = nums[j];
        }
    }

    return i + 1;
}

}
