class Solution {
    public int solution(String[] babbling) {
        int count = 0;
        for (int i = 0; i < babbling.length; i++) {
            String[] arr = new String[babbling[i].split("aya|ye|woo|ma").length];
            arr = babbling[i].split("aya|ye|woo|ma");
            if (arr.length == 0) {
                count++;
            }
        }
        return count;
    }
}