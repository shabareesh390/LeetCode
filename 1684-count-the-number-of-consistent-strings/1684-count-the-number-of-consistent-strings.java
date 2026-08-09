class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean consistent = true;

            for (int j = 0; j < words[i].length(); j++) {
                boolean found = false;

                for (int k = 0; k < allowed.length(); k++) {
                    char ch = words[i].charAt(j);

                    if (ch == allowed.charAt(k)) {
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
}