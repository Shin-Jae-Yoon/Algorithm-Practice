import java.util.*;
import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static int N, max, min;
    static int[] nums, operators;
    
    static void rec_func(int k, int value) {
        if (k == N) {
            max = Math.max(max, value);
            min = Math.min(min, value);
        } else {
            for (int cand = 1; cand <= 4; cand++) {
                if (operators[cand] >= 1) {
                    operators[cand]--;
                    rec_func(k + 1, calculator(value, nums[k+1], cand));
                    operators[cand]++;
                }
            }
        }
    }
    
    static int calculator(int a, int b, int oper) {
        int result = 0;
        
        if (oper == 1) {
            return a + b;
        } else if (oper == 2) {
            return a - b;
        } else if (oper == 3) {
            return a * b;
        } else {
            return a / b;
        }
    }
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        nums = new int[N+1];
        operators = new int[5];
        
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= 4; i++) {
            operators[i] = Integer.parseInt(st.nextToken());
        }
        
        rec_func(1, nums[1]);
        sb.append(max).append('\n').append(min);
        System.out.println(sb.toString());
    }
}