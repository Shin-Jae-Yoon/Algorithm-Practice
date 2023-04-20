class Solution {
    static int N, M;
    static int answer = 0;
    static int[] selected;
    
    static void rec_func(int k) {
        if (k == M + 1) {
            answer++;
        } else {
            for (int cand = selected[k-1] + 1; cand <= N; cand++) {
                selected[k] = cand;
                rec_func(k + 1);
                selected[k] = 0;
            }
        }
    }
    
    public int solution(int balls, int share) {
        N = balls;
        M = share;
        
        selected = new int[M + 1];
        rec_func(1);
        return answer;
    }
}