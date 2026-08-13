class Solution {
    public int prefixCount(String[] words, String pref) {
        char[] ch=new char[pref.length()];
        for(int i=0;i<pref.length();i++){
            ch[i]=pref.charAt(i);
        }
        int count=0;
        for(int i=0;i<words.length;i++){
            if(words[i].length() >= pref.length()){
                boolean match=true;
                for(int j=0;j<pref.length();j++){
                    if(ch[j] != words[i].charAt(j)){
                        match=false;
                        break;
                    }
                }
                if(match){
                    count++;
                }
            }
        }
        return count;

    }
}