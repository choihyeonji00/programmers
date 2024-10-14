import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] parts = myString.split("x");
        String[] answer = Arrays.stream(parts)
                                .filter(str -> !str.isEmpty())
                                .sorted()
                                .toArray(String[]::new);
        return answer;
    }
}