class Solution {
    public int solution(int a, int b) {
    
        int plus = Integer.valueOf((String.valueOf(a) + String.valueOf(b)));
        int multiply = 2 * a * b;
        return plus > multiply ? plus : multiply;
    }
}