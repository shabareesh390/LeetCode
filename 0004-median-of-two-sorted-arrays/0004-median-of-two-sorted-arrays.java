class Solution {
    public double findMedianSortedArrays(int[] num1, int[] num2) {
        int[] arr=new int[num1.length+num2.length];
        int k=0;
        for(int i=0;i<num1.length;i++){
            arr[k]=num1[i];
            k++;
        }
        for(int j=0;j<num2.length;j++){
            arr[k]=num2[j];
            k++;
        }
        Arrays.sort(arr);
        if(arr.length%2 == 0){
             return (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2.0;
        }
        return arr[arr.length/2];
    }
}