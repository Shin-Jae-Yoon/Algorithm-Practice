class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        
        int max = Math.max(sides[0], sides[1]);
        int min = Math.min(sides[0], sides[1]);
        
        for (int i = 1; i < min + max; i++) {
            // i가 가장 긴 변
            if(i > max) {
                if(min + max > i){
                    answer++;
                }
            } 
            // max가 가장 긴 변
            else {
                if(min + i > max){
                    answer++;
                }
            }
        }
        
        return answer;
    }
}