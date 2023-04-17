class Solution {
    public int solution(int n) {
        int num = 6;
        int count = 1;
        
        while (num % n != 0) {
            num += 6;
            count++;
        }
        
        return count;
    }
}