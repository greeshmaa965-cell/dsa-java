
////////////////////////////////////////////////////////////brute sol//////////////////////////////////////////////////////////////////////////////////

class Solution {
    public double myPow(double x, int n) {

        long N = n;

        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1;

        for (long i = 0; i < N; i++) {
            ans *= x;
        }

        return ans;
    }
}










/////////////////////////////////optimal solution////////////////////////////////////////////////////////////////////////////////////////////////////////

class Solution {
    public double myPow(double x, int n) {

        long N = n;

        // Handle negative exponent
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }

        double ans = 1.0;

        while (N > 0) {

            // If exponent is odd
            if (N % 2 == 1) {
                ans *= x;
                N--;
            }
            // If exponent is even
            else {
                x *= x;
                N /= 2;
            }
        }

        return ans;
    }
}










