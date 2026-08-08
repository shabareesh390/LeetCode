class Solution {
    public int minElement(int[] nums) {
        for(int i=0;i<nums.length;i++){
            nums[i]=sum(nums[i]);
        }
        Arrays.sort(nums);
        return nums[0];
    }
    static int sum(int num){
        if(num==0){
            return 0;
        }
        int rem=num%10;
        int n=num/10;
        return (rem+sum(n));
    }
}