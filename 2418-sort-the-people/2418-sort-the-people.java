class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        for(int i=0;i<heights.length;i++){
            for(int j=i+1;j<heights.length;j++){
                if(heights[i]<heights[j]){
                    String temp=names[j];
                    names[j]=names[i];
                    names[i]=temp;

                    int tempHeight = heights[i];
                    heights[i] = heights[j];
                    heights[j] = tempHeight;
                }
            }
        }
        return names;
    }
    
}