import java.util.*;
import java.io.*;

public class Main {
    static int N, S, sum, count;
    static int[] input;
    static StringBuilder sb = new StringBuilder();

    static void rec_func(int k, int value) {
        if (k == N + 1) {
            if (value == S) count++;
        } else {
            rec_func(k + 1, value + input[k]);
            rec_func(k + 1, value);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        input = new int[N+1];
        for (int i = 1; i <= N; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }
        rec_func(1, 0);
        if (S == 0) {
            count--;
        }
        System.out.println(sb.append(count).toString());
    }
}