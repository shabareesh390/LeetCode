class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    swap(heights,i,j);
                    swap(names,i,j);
                }
            }
        }
        return names;
    }
     static void swap(int[] heights, int i, int j) {
        int temp = heights[i];
        heights[i] = heights[j];
        heights[j] = temp;
    }

    static void swap(String[] names, int i, int j) {
        String temp = names[i];
        names[i] = names[j];
        names[j] = temp;
    }
   
    
}