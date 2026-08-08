class Solution {

    static final long MOD = 1000000007;

    public int countGoodNumbers(long n) {

        long evenPositions = (n + 1) / 2;
        long oddPositions = n / 2;

        long ans1 = power(5, evenPositions);
        long ans2 = power(4, oddPositions);

        return (int)((ans1 * ans2) % MOD);
    }

    static long power(long x, long n) {

        long ans = 1;

        while (n > 0) {

            if (n % 2 == 1) {
                ans = (ans * x) % MOD;
                n--;
            }
            else {
                x = (x * x) % MOD;
                n /= 2;
            }
        }

        return ans;
    }
}
