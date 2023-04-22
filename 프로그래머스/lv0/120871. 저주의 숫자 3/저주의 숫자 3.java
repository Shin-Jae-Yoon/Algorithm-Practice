class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        while (n > 0) {
            count++;
            
            if (count % 3 == 0 || count % 10 == 3 || count / 10 == 3 || count / 10 == 13) {
                continue;
            } else {
                answer = count;
                n--;
            }
        }
        
        return answer;
    }
}