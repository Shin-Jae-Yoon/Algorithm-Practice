class Solution {
    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            if (c == '2')
                answer += String.valueOf('0');
            else if (c == '0')
                answer += String.valueOf('5');
            else
                answer += String.valueOf('2');
        }
        return answer;
    }
}