class Solution {
    public int[] sortArray(int[] nums) {
        sort(nums,0,nums.length-1);
        return nums ;
    }

    static void sort(int[] arr,int low,int hi){
        if(low>=hi){
         return;
        }
        int s=low;
        int e=hi;
        int mid=s+(e-s)/2;
        int pivot=arr[mid];
        while(s<=e){
            while (arr[s]<pivot){
                s++;
            }
            while (arr[e]>pivot){
                e--;
            }
            if(s<=e){
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,low, e);
        sort(arr,s,hi);

    }
}