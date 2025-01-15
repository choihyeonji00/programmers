class Solution {
    public long solution(int price, int money, int count) {

        long increasedPrice=price;
        long answer=money;
        for(int i =1; i<=count ; i++){
         
            answer-=increasedPrice;
            increasedPrice+=price;
        }
        
        return answer<0? answer*-1 : 0;
    }
}