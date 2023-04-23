class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int distance1 = common[1] - common[0];
        int distance2 = common[2] - common[1];
        
        if (distance1 == distance2) {
            answer = common[common.length - 1] + distance1;
        } else {
            answer = common[common.length - 1] * (common[1] / common[0]);
        }
        
        return answer;
    }
}