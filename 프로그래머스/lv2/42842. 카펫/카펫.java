class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] answer = new int[2];
        for (int i = 1; i <= sum; i++) {
            if (sum % i == 0) {
                if (sum / i <= i && ((i - 2) * ((sum / i) - 2) == yellow)) {
                    answer[0] = i;
                    answer[1] = sum / i;
                    break;
                }
            }
        }
        
        return answer;
    }
}