class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        
        for (int i = 0; i < dic.length; i++) {
            if (spell.length == dic[i].length()) {
                boolean isTrue = true;
                for (int j = 0; j < spell.length; j++) {
                    if (dic[i].indexOf(spell[j]) == -1) {
                        answer = 2;
                        isTrue = false;
                        break;
                    }
                }

                if (isTrue) {
                    answer = 1;
                    break;
                }
            }
        }
        
        return answer;
    }
}