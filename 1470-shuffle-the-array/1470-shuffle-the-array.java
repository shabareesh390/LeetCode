class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans=new int[2*n];
        int k=0;
        int j=1;
        for(int i=0;i<n;i++){
            ans[k]=nums[i];
            ans[j]=nums[n+i];
            j+=2;
            k+=2;
        }
        return ans;
    }
}