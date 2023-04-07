import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        String[] answer = Arrays.copyOf(players, players.length);
        HashMap<String, Integer> pmap = new HashMap<>();
        
        for (int i = 0; i < players.length; i++) {
            pmap.put(players[i], i);
        }
        
        for (int i = 0; i < callings.length; i++) {
            String current = callings[i];
            int currentIdx = pmap.get(current);
            int prevIdx = currentIdx - 1;
            String prev = answer[prevIdx];
            
            answer[currentIdx] = prev;
            answer[prevIdx] = current;
            
            pmap.put(current, prevIdx);
            pmap.put(prev, currentIdx);
        }
        
        return answer;
    }
}