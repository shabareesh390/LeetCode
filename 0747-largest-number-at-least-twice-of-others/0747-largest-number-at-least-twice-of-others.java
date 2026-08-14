class Solution {
    public int dominantIndex(int[] nums) {
        int max = nums[0];
        int smax = Integer.MIN_VALUE;
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
                index = i;
            } else if (nums[i] > smax) {
                smax = nums[i];
            }
        }

        if (max >= smax * 2) {
            return index;
        }

        return -1;
    }
}