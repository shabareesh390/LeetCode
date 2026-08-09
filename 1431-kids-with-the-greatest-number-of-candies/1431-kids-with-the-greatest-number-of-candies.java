class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=candies[0];
        ArrayList<Boolean> list=new ArrayList<>();
        for(int i=1;i<candies.length;i++){
            max=Math.max(max,candies[i]);
            
        }
        for(int i=0;i<candies.length;i++){
            candies[i]+=extraCandies;
            if(candies[i]>=max){
                list.add(true);
            }
            else{
                list.add(false);
            }
        }
        return list;
    }
}