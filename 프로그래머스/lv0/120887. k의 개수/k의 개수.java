class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int num = i; num <= j; num++) {
            String[] str = String.valueOf(num).split("");
            for (int loop = 0; loop < str.length; loop++) {
                if (str[loop].equals(String.valueOf(k)))
                    answer++;
            }
        }
        
        return answer;
    }
}