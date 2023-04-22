class Solution {
    public int[] solution(int[][] score) {
        double[] average = new double[score.length];
        int[] answer = new int[score.length];
        
        for (int i = 0; i < average.length; i++) {
            average[i] = (score[i][0] + score[i][1]) / 2.0;
            answer[i] = 1;
        }
        
        double[] copy = average;
        
        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < copy.length; j++) {
                if (average[i] < copy[j]) {
                    answer[i]++;
                }
            }
        }
    
        return answer;
    }
}