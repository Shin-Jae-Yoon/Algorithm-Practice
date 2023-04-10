import java.util.*;

public class Solution {
    public int solution(int n) {
        int sum = 0;
        while (true) {
            sum += n % 10;
            if (n < 10)
                break;
            n /= 10;
        }
        return sum;
    }
}