class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];

            while (num > 0) {
                if (num % 10 == digit) {
                    ans++;
                }
                num /= 10;
            }
        }

        return ans;
    }
}