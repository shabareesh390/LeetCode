class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
       ArrayList<Integer> list=new ArrayList<>();
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i] == 1){
            count++;
        }
        else{
            list.add(count);
            count=0;
        }
       }
       list.add(count); 
       return Collections.max(list);
    }
}