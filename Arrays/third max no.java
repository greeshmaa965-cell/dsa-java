class Solution {
    public int thirdMax(int[] nums) {
        long max = Long.MIN_VALUE;
        long smax = Long.MIN_VALUE;
        long tmax = Long.MIN_VALUE;

        for(int num:nums){
            if(num>max){
                tmax=smax;
                smax=max;
                max=num;
            }
            else if(num > smax && num!=max){
                tmax=smax;
                smax=num;
            }
            else if(num>tmax && num!=smax && max!=num){
                tmax=num;
            }
        }
        return tmax!=Long.MIN_VALUE ? (int)tmax : (int)(max);
    }
}
/*import java.util.*;

class Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        Integer[] arr = set.toArray(new Integer[0]);
        Arrays.sort(arr);

        int n = arr.length;
        if (n < 3) {
            return arr[n - 1];      // return max
        } else {
            return arr[n - 3];      // return 3rd max
        }
    }
}
*/
