class Solution {
    static int search(int[] arr,int target){
        int pivot=pivot(arr,0, arr.length-1);
        if(pivot==-1) {
            return Binarysearch(arr,target,0, arr.length-1);
        }
        if(target==arr[pivot]){
            return pivot;
        }
        if(target>=arr[0]){
            return Binarysearch(arr,target,0,pivot);
        }
        else {
            return Binarysearch(arr,target,pivot+1, arr.length-1);
        }

    }
    static int pivot(int[] arr, int start, int end) {
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid>start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            if (arr[mid] >= arr[start]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    static int Binarysearch(int[] arr,int target,int start,int end){

        while (start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            } else if (target<arr[mid]) {
                end=mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;

    }
}