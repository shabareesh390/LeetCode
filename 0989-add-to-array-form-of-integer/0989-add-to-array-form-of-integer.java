import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        String temp = "";

        for (int i = 0; i < num.length; i++) {
            temp += num[i];
        }

        BigInteger n = new BigInteger(temp);
        n = n.add(BigInteger.valueOf(k));

        String result = n.toString();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < result.length(); i++) {
            list.add(result.charAt(i) - '0');
        }

        return list;
    }
}