class Solution {
    public int solution(int a, int b) {
        b = b / GCD(a, b);
        
        while (b != 1) {
            if (b % 2 == 0)
                b /= 2;
            else if (b % 5 == 0)
                b /= 5;
            else
                return 2;
        }
        
        return 1;
    }
    
    int GCD(int a, int b) {
        if (b == 0)
            return a;
        else
            return GCD(b, a % b);
    }
}

