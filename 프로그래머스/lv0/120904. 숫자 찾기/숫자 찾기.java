class Solution {
    public int solution(int num, int k) {
        
        String str = String.valueOf(num);
        int answer = -1;
        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) - '0' == k) {
                answer = i + 1;
                break;
            }
        }

        return answer;
    }
}