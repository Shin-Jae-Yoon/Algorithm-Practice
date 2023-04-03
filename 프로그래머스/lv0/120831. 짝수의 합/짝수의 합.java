class Solution {
    public int solution(int n) {
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) continue;
            answer += i;
        }
        return answer;
    }
}