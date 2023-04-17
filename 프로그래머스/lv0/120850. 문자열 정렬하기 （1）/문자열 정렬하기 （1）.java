import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < my_string.length(); i++) {
            if ('0' <= my_string.charAt(i) && my_string.charAt(i) <= '9')
                list.add(my_string.charAt(i) - '0');
        }
        
        Collections.sort(list);
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}