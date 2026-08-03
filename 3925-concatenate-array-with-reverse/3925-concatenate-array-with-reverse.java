class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans=new int[nums.length*2];
        int k=0;
        for(int i=0;i<nums.length;i++){
            ans[k]=nums[i];
            k++;
        }
        for(int j=nums.length-1;j>=0;j--){
            ans[k]=nums[j];
            k++;
        }
        return ans;
    }
}