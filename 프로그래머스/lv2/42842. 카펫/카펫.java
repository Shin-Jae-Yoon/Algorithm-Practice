class Solution {
    public int[] solution(int brown, int yellow) {
        int sum = brown + yellow;
        int[] answer = new int[2];
        for (int width = 3; width <= sum; width++) {
            int height = sum / width;
            if (sum % width == 0) {
                if (height <= width && ((width - 2) * (height - 2) == yellow)) {
                    answer[0] = width;
                    answer[1] = height;
                    break;
                }
            }
        }
        
        return answer;
    }
}