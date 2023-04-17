import java.util.HashMap;
class Solution {
    public String solution(int age) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "a");
        map.put(1, "b");
        map.put(2, "c");
        map.put(3, "d");
        map.put(4, "e");
        map.put(5, "f");
        map.put(6, "g");
        map.put(7, "h");
        map.put(8, "i");
        map.put(9, "j");
        
        String answer = "";
        String[] arrAge = String.valueOf(age).split("");
        
        for (int i = 0; i < arrAge.length; i++) {
            answer += map.get(Integer.parseInt(arrAge[i]));
        }
        
        return answer;
    }
}