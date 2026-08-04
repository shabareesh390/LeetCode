class Solution {
    static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String digits) {
        ArrayList<String> ans=new ArrayList<>();
        if(digits==null || digits.length()==0){
            
            return ans;
        }
        helper("",digits,ans);
        return ans;
    }
    static void helper(String p,String up,List<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return;
        }
        int digits=up.charAt(0)-'0';
        String letters=map[digits];
        for(int i=0;i<letters.length();i++){
            helper(p+letters.charAt(i),up.substring(1),ans);
        }
    }

}