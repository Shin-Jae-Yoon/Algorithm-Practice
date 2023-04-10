class Solution {
    public int solution(int n) {
        // 내 코드는 전부 다 돌려야해서 별로 안좋음
        // int answer = n;
        // for (int i = 1; i <= n; i++) {
        //     if (n % i == 1) {
        //         answer = Math.min(answer, i);
        //     }
        // }
        // return answer;
        int answer = 1;
        for (int i = 2; i < n; i++) {
            if (n % i == 1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}