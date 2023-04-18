import java.util.Arrays;
class Solution {
    public int solution(int[] array, int n) {
        int min = Integer.MAX_VALUE;
        int answer = Integer.MAX_VALUE;
        Arrays.sort(array);
        
        for (int i = 0; i < array.length; i++) {
            if (Math.abs(array[i] - n) < min){
                min = Math.abs(array[i] - n);
                answer = array[i];
            }
        }
        
        return answer;
    }
}