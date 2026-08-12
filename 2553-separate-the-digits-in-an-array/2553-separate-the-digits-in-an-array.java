class Solution {
    public int[] separateDigits(int[] nums) {

        int size = 0;
        for (int num : nums) {
            while (num > 0) {
                size++;
                num /= 10;
            }
        }

        int[] ans = new int[size];
        int k = 0;

        for (int num : nums) {

            int digits = 0;
            int temp = num;

           
            while (temp > 0) {
                digits++;
                temp /= 10;
            }

           
            int div = 1;
            for (int i = 1; i < digits; i++) {
                div *= 10;
            }

            
            while (div > 0) {
                ans[k++] = num / div;
                num %= div;
                div /= 10;
            }
        }

        return ans;
    }
}