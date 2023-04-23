class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int numer3 = ((numer1 * denom2) + (numer2 * denom1));
        int denom3 = denom1 * denom2;
        int num = GCD(numer3, denom3);
        
        numer3 /= num;
        denom3 /= num;
        
        answer[0] = numer3;
        answer[1] = denom3;
        
        return answer;
    }
    
    int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }
}