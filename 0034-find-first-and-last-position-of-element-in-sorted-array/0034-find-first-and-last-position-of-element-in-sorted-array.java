class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans={-1,-1};
        int first=search(nums,target,true);
        int last=search(nums,target,false);
        ans[0]=first;
        ans[1]=last;
        return ans;
    }
    static int search(int[] nums,int target,boolean findFirst){
        int s=0;
        int e=nums.length-1;
        int ans=-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(target>nums[mid]){
                s=mid+1;
            }
            else if(target<nums[mid]){
                e=mid-1;
            }
            else{
                ans=mid;
                if(findFirst){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }
}