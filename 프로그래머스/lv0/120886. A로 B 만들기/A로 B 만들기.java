class Solution {
    static int[] countAlphabet(String str) {
        int[] count = new int[26];
        
        for (int i = 0; i < str.length(); i++) {
            count[(str.charAt(i) - 'a')]++;
        }
        
        return count;
    }
    
    public int solution(String before, String after) {
        int answer = 0;
        
        int[] countBefore = countAlphabet(before);
        int[] countAfter = countAlphabet(after);
        
        for (int i = 0; i < 26; i++) {
            if (countBefore[i] - countAfter[i] != 0)
                answer++;
        }
        
        return (answer == 0) ? 1 : 0;
    }
}