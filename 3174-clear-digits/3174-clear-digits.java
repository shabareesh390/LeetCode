class Solution {
    public String clearDigits(String s) {
        StringBuilder st = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                st.deleteCharAt(st.length() - 1);
            } else {
                st.append(ch);
            }
        }

        return st.toString();
    }
}