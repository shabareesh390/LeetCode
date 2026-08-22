class Solution {
    public int[] twoSum(int[] nums, int target) {
       ArrayList<Integer> values=new ArrayList<>();
       ArrayList<Integer> indexes=new ArrayList<>(); 

       for(int i=0;i<nums.length;i++){
        int need=target-nums[i];
        if(values.contains(need)){
            int pos=values.indexOf(need);
            return new int[]{indexes.get(pos),i};
        }

        values.add(nums[i]);
        indexes.add(i);
       } 
       return new int[]{};
    }
}