class Solution {
    public int addDigits(int num) {
        int digitSum=sum(num);
        
        while(digitSum>9){
            digitSum=sum(digitSum);
        }
        return digitSum;


    }
    static int sum(int n){
        
        if(n==0){
            return 0;
        }
        int rem=n%10;
        int num=n/10;
        return rem+sum(num);
    
    }

}