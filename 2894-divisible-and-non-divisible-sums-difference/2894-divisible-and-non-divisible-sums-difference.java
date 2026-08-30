class Solution {
    public int differenceOfSums(int n, int m) {
        int sum=0;
        for(int i=1;i<=n;i++){
           if(i % m != 0){
            sum+=i;
           }
        }
        int num1=sum;

        sum=0;
        for(int i=1;i<=n;i++){
            if(i % m == 0){
                sum+=i;
            }
        }
        int num2=sum;
        return num1-num2;
    }
}