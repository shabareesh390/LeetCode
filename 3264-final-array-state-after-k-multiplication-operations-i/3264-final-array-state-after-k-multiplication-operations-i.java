class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int count = 0; count < k; count++) {

            int minIndex = 0;

            
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] < nums[minIndex]) {
                    minIndex = i;
                }
            }

            // Multiply the minimum
            nums[minIndex] *= multiplier;
        }

        return nums;
    }
}