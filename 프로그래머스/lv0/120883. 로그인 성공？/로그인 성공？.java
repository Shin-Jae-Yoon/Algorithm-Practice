import java.util.HashMap;

class Solution {
    public String solution(String[] id_pw, String[][] db) {
        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < db.length; i++) {
            map.put(db[i][0], db[i][1]);
        }
        
        String answer = "";
        if (map.containsKey(id_pw[0])) {
            if (id_pw[1].equals(map.get(id_pw[0])))
                answer = "login";
            else
                answer = "wrong pw";
        } else {
            answer = "fail";
        }   
        
        return answer;
    }
}