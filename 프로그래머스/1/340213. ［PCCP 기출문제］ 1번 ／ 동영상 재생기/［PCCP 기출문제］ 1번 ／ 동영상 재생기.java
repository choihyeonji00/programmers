class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        String answer = "";

        int[] videoInt = clockSplit(video_len);
        int[] posInt = clockSplit(pos);
        int[] startInt = clockSplit(op_start);
        int[] endInt = clockSplit(op_end);

        for(int i=0; i<commands.length; i++) {
            posInt = skip(startInt, endInt, posInt);
            if(commands[i].equals("next")) posInt = next(videoInt, posInt);
            else posInt = prev(posInt);
        }
        posInt = skip(startInt, endInt, posInt);

        for(int i=0; i<2; i++) {
            if(posInt[i] < 10) {
                answer+="0";
                answer+=posInt[i];
            }
            else answer+=posInt[i];
            answer+= i==0 ? ":" : "";
        }

        return answer;
    }

    private static int[] clockSplit(String arr) {
        String[] SArr = arr.split(":");
        int[] intArr = new int[2];
        for(int i=0; i<2; i++) {
            intArr[i] = Integer.parseInt(SArr[i]);
        }
        return intArr;
    }

    private static int[] next(int[] videoInt, int[] posInt) {
        int[] videoIntCopy = {videoInt[0], videoInt[1]};
        posInt[1] += 10;
        if(posInt[1] >= 60) {
            posInt[0] += 1;
            posInt[1] -= 60;
        }
        if((videoInt[0] < posInt[0]) || (videoInt[0] == posInt[0] && videoInt[1] <= posInt[1])) return videoIntCopy;
        return posInt;
    }

    private static int[] prev(int[] posInt) {
        posInt[1] -= 10;
        if(posInt[1] < 0) {
            posInt[0] -= 1;
            posInt[1] += 60;
        }
        if((0 > posInt[0]) || (0 == posInt[0] && 0 >= posInt[1])) {
            posInt[0] = 0;
            posInt[1] = 0;
        }
        return posInt;
    }

    private static int[] skip(int[] startInt, int[] endInt, int[] posInt) {
        int[] endIntCopy = {endInt[0], endInt[1]};
        if(((startInt[0] < posInt[0]) || (startInt[0] == posInt[0] && startInt[1] <= posInt[1])) && ((posInt[0] < endInt[0]) || (posInt[0] == endInt[0] && posInt[1] <= endInt[1]))) return endIntCopy;
        return posInt;
    }
}