class Solution {

    int MOD = 1000000007;
    Integer[][] dp;

    public int numRollsToTarget(int n, int k, int target) {
        dp = new Integer[n + 1][target + 1];
        return helper(n, k, target);
    }

    private int helper(int dice, int faces, int target) {

        if (dice == 0) {
            return target == 0 ? 1 : 0;
        }

        if (target < 0) {
            return 0;
        }

     
        if (target < dice || target > dice * faces) {
            return 0;
        }

        if (dp[dice][target] != null) {
            return dp[dice][target];
        }

        long ways = 0;

        for (int i = 1; i <= faces && i <= target; i++) {
            ways = (ways + helper(dice - 1, faces, target - i)) % MOD;
        }

        return dp[dice][target] = (int) ways;
    }
}