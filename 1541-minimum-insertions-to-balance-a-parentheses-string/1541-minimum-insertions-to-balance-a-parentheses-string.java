class Solution {
     public int minInsertions(String s){
        Stack<Character> stack=new Stack<>();
        int ans=0;
        for (int i = 0; i < s.length(); i++) {
           char ch=s.charAt(i);
           if(ch=='('){
               stack.push('(');
           }
           else {
               if(i+1 < s.length() && s.charAt(i+1)==')'){
                   if(!stack.isEmpty()){
                       stack.pop();
                   }
                   else {
                       ans++;
                   }
                   i++;
               }
               else {
                   if(!stack.isEmpty()){
                       stack.pop();
                       ans++;
                   }
                   else {
                       ans+=2;
                   }
               }

           }
        }
        return ans+ stack.size()*2;
    }
}