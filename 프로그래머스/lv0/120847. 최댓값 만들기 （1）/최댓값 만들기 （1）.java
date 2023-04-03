import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        int n = numbers[numbers.length - 1];
        int m = numbers[numbers.length - 2];
        return n * m;
    }
}