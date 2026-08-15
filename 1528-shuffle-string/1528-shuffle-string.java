class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ans=new char[s.length()];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int index=indices[i];
            ans[index]=ch;
        }
        
        return new String(ans);
    }
}