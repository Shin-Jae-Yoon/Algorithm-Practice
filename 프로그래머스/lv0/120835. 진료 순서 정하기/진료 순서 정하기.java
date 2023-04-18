import java.util.HashMap;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < emergency.length; i++) {
            map.put(emergency[i], i);
        }

        Arrays.sort(emergency);
        
        for (int i = emergency.length - 1; i >= 0; i--) {
            answer[map.get(emergency[i])] = emergency.length - i;
        }
        
        return answer;
    }
}