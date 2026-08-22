class Solution {
     public int largestRectangleArea(int[] heights){
        int[] pse=ps(heights);
        int[] nse=ns(heights);
        int max=0;
        for (int i = 0; i < heights.length; i++) {
            int area=(nse[i]-pse[i]-1)*heights[i];
            max=Math.max(max,area);
        }
        return max;

    }
    static int[] ps(int[] heights){
        int n= heights.length;
        int[] ps=new int[n];
        Stack<Integer> stack=new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ps[i]=-1;
            }
            else {
                ps[i]=stack.peek();
            }
            stack.push(i);
        }
        return ps;
    }
    static int[] ns(int[] heights){
        int n= heights.length;
        int[] ns=new int[n];
        Stack<Integer> stack=new Stack<>();
        for (int i = n-1; i >=0; i--) {
            while (!stack.isEmpty() && heights[i]<=heights[stack.peek()]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ns[i]=n;
            }
            else {
                ns[i]=stack.peek();
            }
            stack.push(i);
        }
        return ns;
    }
}