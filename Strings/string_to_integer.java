class Solution {
    public int myAtoi(String s) {

        s = s.trim();

        if (s.length() == 0) {
            return 0;
        }

        int i = 0;
        int sign = 1;
        long num = 0;

        if (s.charAt(0) == '+') {
            sign = 1;
            i++;
        }
        else if (s.charAt(0) == '-') {
            sign = -1;
            i++;
        }

        while (i < s.length() &&
               s.charAt(i) >= '0' &&
               s.charAt(i) <= '9') {

            num = num * 10 + (s.charAt(i) - '0');
            i++;
        }

        num = num * sign;

        if (num > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }

        if (num < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) num;
    }
}
