import java.util.*;
class Solution {
    public String solution(String s) {
        String[] input = s.split(" ");
        ArrayList<Integer> arr = new ArrayList<Integer>();
        
        for (int i = 0; i < input.length; i++) {
            arr.add(Integer.parseInt(input[i]));
        }
        
        String answer = Collections.min(arr) + " " + Collections.max(arr);
        return answer;
    }
}