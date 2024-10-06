public class Solution {
    public static String solution(String myString, int s, int e) {
        StringBuilder result = new StringBuilder(myString);
        StringBuilder reversedSubstring = new StringBuilder(myString.substring(s, e + 1)).reverse();
        result.replace(s, e + 1, reversedSubstring.toString());
        return result.toString();
    }
}