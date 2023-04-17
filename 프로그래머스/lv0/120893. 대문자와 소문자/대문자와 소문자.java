class Solution {
    public String solution(String my_string) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            char c = my_string.charAt(i);
            if ('a' <= c && c <= 'z') {
                answer += (char)('A' + (c - 'a'));
            } else {
                answer += (char)('a' + (c - 'A'));
            }
        }
        return answer;
    }
}