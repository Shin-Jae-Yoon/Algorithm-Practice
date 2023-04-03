class Solution {
    public int solution(int angle) {
        int answer = 0;
        
        if (angle == 180)
            answer = 4;
        else if (90 < angle)
            answer = 3;
        else if (angle == 90)
            answer = 2;
        else if (0 < angle)
            answer = 1;
        else
            answer = -1;
        
        return answer;
    }
}