class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i * i == n) {
                answer = i;
                break;
            }
        }
        
        return answer != 0 ? 1 : 2;
    }
}