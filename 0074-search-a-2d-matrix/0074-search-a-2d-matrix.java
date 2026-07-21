class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m=0;
        int n=matrix[0].length-1;
        while(m<matrix.length && n>=0){
            if(target==matrix[m][n]){
                return true;
            }
            if(matrix[m][n]<target){
                m++;
            }
            else{
                n--;
            }
        }
        return false;
    }
}