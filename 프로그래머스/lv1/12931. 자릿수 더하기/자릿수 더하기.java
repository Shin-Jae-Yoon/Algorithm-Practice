import java.util.*;

public class Solution {
    public int solution(int n) {
        String input = String.valueOf(n);
        char[] input2 = input.toCharArray();
        int sum = 0;
        
        for (int i = 0; i < input2.length; i++) {
            sum += (int)input2[i] - '0';
        }

        return sum;
    }
}