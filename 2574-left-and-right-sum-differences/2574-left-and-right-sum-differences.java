class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] leftSum=new int[nums.length];
        int[] rigthSum=new int[nums.length];
        int[] ans=new int[nums.length];

        for(int i=1;i<nums.length;i++){
            leftSum[i]=leftSum[i-1]+nums[i-1];
        }
        for (int i = nums.length - 2; i >= 0; i--){
             rigthSum[i]= rigthSum[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs(leftSum[i]-rigthSum[i]);
        }
        return ans;
    }
}   