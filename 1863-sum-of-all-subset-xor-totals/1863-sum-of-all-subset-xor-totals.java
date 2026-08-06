class Solution {
    public int subsetXORSum(int[] nums) {
        return helper(nums,0,0);
    }

    private int helper(int[] nums, int index, int xor) {
       if(index==nums.length){
        return xor;
       }

       int include=helper(nums,index+1,xor ^ nums[index]);
       int exclude=helper(nums,index+1,xor);
       return include+exclude;
    }
}