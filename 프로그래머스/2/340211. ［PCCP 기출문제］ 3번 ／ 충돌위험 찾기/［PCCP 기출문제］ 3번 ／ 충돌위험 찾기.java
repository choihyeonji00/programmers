import java.util.*;

class Solution {
    // 각 로봇의 경로를 저장하는 큐 배열. recode[i]는 i번 로봇의 경로 큐를 저장합니다.
    static Queue<int[]>[] recode;
    // 로봇의 수를 저장하는 변수
    static int n;
    // 결과값, 위험 구역 카운트를 저장하는 변수
    static int result;
    
    // 주어진 points와 routes를 기반으로 위험 지역을 카운트하는 함수
    public int solution(int[][] points, int[][] routes) {
        n = routes.length; // 로봇 수 초기화
        recode = new LinkedList[n]; // 로봇 경로를 저장할 큐 배열 생성
        
        for (int i = 0; i < n; i++) {
            recode[i] = new LinkedList<>(); // 각 로봇 경로 큐 초기화
        }
        
        // 로봇의 이동 경로를 기록하는 함수 호출
        recoding(points, routes);
        
        // 위험 지역을 카운트하는 함수 호출
        dangerousCounting();
        
        return result; // 결과 반환
    }
    
    // 로봇이 이동한 위치에 대해 위험 지역을 카운트하는 함수
    public void dangerousCounting() {
        int count = 0; // 경로가 끝난 로봇의 수를 카운트
        
        // 모든 로봇의 경로가 끝날 때까지 반복
        while (count < n) {
            int[][] map = new int[101][101]; // 101x101 크기의 맵 초기화 (좌표 기준)
            count = 0; // 현재 반복에서 경로가 끝난 로봇 수 초기화
            
            // 각 로봇의 다음 이동 경로를 맵에 기록
            for (int i = 0; i < n; i++) {
                if (recode[i].isEmpty()) { // 해당 로봇이 더 이상 이동할 경로가 없다면
                    count++; // 경로가 끝난 로봇 수 증가
                    continue;
                }
                
                // 로봇의 다음 좌표를 꺼내어 해당 좌표에 기록
                int[] tmp = recode[i].poll();
                map[tmp[0]][tmp[1]]++; // 좌표에 로봇이 지나간 횟수를 기록
            }
            
            // 맵에서 두 개 이상의 로봇이 지나간 좌표를 카운트
            for (int i = 0; i < 101; i++) {
                for (int j = 0; j < 101; j++) {
                    if (map[i][j] > 1) result++; // 두 개 이상의 로봇이 지나간 좌표 카운트
                }
            }
        }
    }
    
    // 각 로봇의 경로를 기록하는 함수
    public void recoding(int[][] points, int[][] routes) {
        // 로봇 수만큼 반복하여 각 로봇의 경로를 기록
        for (int i = 0; i < n; i++) {
            // 각 로봇의 시작 위치를 설정
            int[] route = routes[i];
            int x = points[route[0] - 1][1]; // x 좌표
            int y = points[route[0] - 1][0]; // y 좌표
            
            // 시작 위치를 큐에 추가
            recode[i].add(new int[] {x, y});
            
            // 경로에 따라 다음 목표 위치로 이동
            for (int j = 1; j < route.length; j++) {
                int px = points[route[j] - 1][1]; // 다음 목표 위치의 x 좌표
                int py = points[route[j] - 1][0]; // 다음 목표 위치의 y 좌표
                
                // y 좌표를 먼저 맞춘 후에 x 좌표 이동
                while (py != y) {
                    if (py > y) y++; // 목표 y 좌표가 더 크면 y를 증가
                    else y--; // 목표 y 좌표가 더 작으면 y를 감소
                    
                    // 이동한 좌표를 큐에 기록
                    recode[i].add(new int[]{x, y});
                }
                // x 좌표 이동 처리
                while (px != x) {
                    if (px > x) x++; // 목표 x 좌표가 더 크면 x를 증가
                    else x--; // 목표 x 좌표가 더 작으면 x를 감소
                    
                    // 이동한 좌표를 큐에 기록
                    recode[i].add(new int[]{x, y});
                }
            }
        }
    }
}