class Solution {
    public int solution(int chicken) {
        int coupon = chicken;
        int service = 0, answer = 0;
        
        while (coupon > 9) {
            service = coupon / 10;
            coupon = service + (coupon % 10);
            answer += service;
        }
                
        return answer;
    }
}