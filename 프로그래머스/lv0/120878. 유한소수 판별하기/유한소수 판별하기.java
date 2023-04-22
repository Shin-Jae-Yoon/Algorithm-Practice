class Solution {
    public int solution(int a, int b) {
        int answer = 2;
        int up = a;
        int down = b;
        
        // 분자가 분모보다 크면 나눠주기
        if (up >= down) {
            if (up % down == 0) {
                answer = 1;
            } else {
                up = up % down;
            }
        }
        
        // 약분 가능하면 약분해주기
        for (int i = 2; i <= down; i++) {
            if (up % i == 0 && down % i ==0) {
                up /= i;
                down /= i;
            }
        }
        
        while (down > 0) {
            if (down % 5 == 0)
                down /= 5;
            
            if (down % 2 == 0)
                down /= 2;
            
            if (down == 1) {
                answer = 1;
                break;
            } else if (down != 1 && down % 2 != 0 && down % 5 != 0) {
                answer = 2;
                break;
            }
        }
           
        return answer;
    }
}