class Solution {
    public int scoreOfString(String s) {
        int[] arr=new int[s.length()];
      for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        int ascii=ch+0;
        arr[i]=ascii;
      }
      int diff=0;
      for(int i=0;i<arr.length-1;i++){
       diff+= Math.abs(arr[i]-arr[i+1]);
      }
      return diff;  
    }
}