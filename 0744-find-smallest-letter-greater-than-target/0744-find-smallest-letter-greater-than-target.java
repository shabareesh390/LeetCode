class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0;
        int e=letters.length-1;
        while (s<=e){
            int mid=s+(e-s)/2;
            if(target>=letters[mid]){
                s=mid+1;
            }
            else {
                e=mid-1;
            }
        }
        return letters[s % letters.length];
    }
}