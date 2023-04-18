class Solution {
    public int solution(String my_string) {
        String[] str = my_string.replaceAll("[^0-9]", " ").split(" ");
        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            if (!(str[i].isEmpty())) {
                answer += Integer.parseInt(str[i]);
            }
        }
        return answer;
    }
}