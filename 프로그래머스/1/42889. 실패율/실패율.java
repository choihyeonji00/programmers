import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        HashMap<Integer, Double> map = new HashMap<>();
        int[] userFailCnts = new int[N+2];
        int[] userTotalCnts = new int[N+1];
        
        //스테이지 별 머물러있는 사용자 수 카운트
        for(int stage : stages) {
            userFailCnts[stage]++;
        }
        
        //스테이지 별 도달한 플레이어 수 카운트
        userTotalCnts[N] = userFailCnts[N] + userFailCnts[N+1];       
        for(int i = N-1; i >=1; i--) {
            userTotalCnts[i] = userFailCnts[i] + userTotalCnts[i+1];
        }
        
        //스테이지 별 실패율 계산
        for (int i = 1; i < userTotalCnts.length; i++) {
            if (userFailCnts[i] == 0 || userTotalCnts[i] == 0) {
                map.put(i, 0.0);
            } else {
                map.put(i, (double)userFailCnts[i] / userTotalCnts[i]);
            }
        }
        
        //실패율(value) 값으로 스테이지(key)를 내림차순 정렬
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, (o1, o2) -> Double.compare(map.get(o2), map.get(o1)));

        return list.stream().mapToInt(Integer::intValue).toArray(); 
    } 
}