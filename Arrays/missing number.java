                                                     /*Brute solution
Arrays.sort(nums);

for (int i = 0; i < nums.length; i++) {
    if (nums[i] != i) {
        return i;
    }
}
return nums.length;*/
                                                     /*better solution
Arrays.sort(nums);

for (int i = 0; i < nums.length; i++) {
    if (nums[i] != i) {
        return i;
    }
}
return nums.length; */          
                                                        /*optimal solution*/
Set<Integer> set = new HashSet<>();

for (int num : nums)
    set.add(num);

for (int i = 0; i <= nums.length; i++) {
    if (!set.contains(i))
        return i;
}
                                              
