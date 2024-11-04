class Solution {
    public String solution(String polynomial) {
        int x = 0;
        int num = 0;
        String answer = "";

        for(String str : polynomial.split(" ")) {
            if(str.equals("+")) {
                continue;
            }
            if(str.contains("x")) {
                if(str.equals("x")) {
                    x += 1;
                } else {
                    x += Integer.parseInt(str.replace("x", ""));   
                }
            } else {
                num += Integer.parseInt(str);
            }
        }

        if (x > 0) {
            answer = (x == 1 ? "x" : Integer.toString(x) + "x");
            if (num > 0) {
                answer = answer + " + ";
            }
        }

        if (num > 0) {
            answer = answer + Integer.toString(num);
        }
        return answer;
    }
}