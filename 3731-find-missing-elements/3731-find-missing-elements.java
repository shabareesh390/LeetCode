class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=1;i<nums.length;i++){
            max=Math.max(max,nums[i]);
            min=Math.min(min,nums[i]);
        }
        for(int i=min+1;i<max;i++){
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(i==nums[j]){
                    found=true;
                    break;
                }
            }
            if(!found){
                list.add(i);
            }
        }
        return list;
    }
}