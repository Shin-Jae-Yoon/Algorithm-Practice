class Solution {
    static int[] countAlphabet(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[(str.charAt(i) - 'a')]++;
        }
        return count;
    }
    
    public String solution(String s) {
        int[] countAnswer = countAlphabet(s);
        String answer = "";
        
        for (int i = 0; i < 26; i++) {
            if (countAnswer[i] == 1)
                answer += (char)(i + 'a');
        }
        
        return answer;
    }
}