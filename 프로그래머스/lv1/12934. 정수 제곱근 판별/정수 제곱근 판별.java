class Solution {
    public long solution(long n) {
        if ((long)(Math.sqrt(n)) * (long)(Math.sqrt(n)) == n)
            return (long)((Math.sqrt(n) + 1) * (Math.sqrt(n) + 1));
        else
            return -1;
    }
}