import java.math.BigInteger;

class Solution {
    public String solution(String a, String b) {
        String answer = "";
        BigInteger sum = new BigInteger(a).add(new BigInteger(b));
        answer = sum.toString();
        return answer;
    }
}