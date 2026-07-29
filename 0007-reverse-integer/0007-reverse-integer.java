class Solution {
    public int reverse(int x) {
        long ans = helper(Math.abs((long) x), 0);

        if (x < 0) {
            ans = -ans;
        }

        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) ans;
    }

    long helper(long n, long rev) {
        if (n == 0) {
            return rev;
        }

        return helper(n / 10, rev * 10 + n % 10);
    }
}