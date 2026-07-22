class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        boolean found=false;
        for(int i=0;i<=n;i++){
            found=search(nums,i);
             if(!found){
            return i;
        }
        }
       return -1;
    }
    static boolean search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
            return true;
        }
        }
        return false;
    }
}