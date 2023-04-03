import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] selected, used;
    static StringBuilder sb = new StringBuilder();

    static void recv_func(int k) {
        if (k == M + 1) {
            for (int i = 1; i <= M; i++) sb.append(selected[i]).append(' ');
            sb.append('\n');
        } else {
            int start = selected[k-1];
            if (start == 0) start = 1;

            for (int cand = start; cand <= N; cand++) {
                if (used[cand] == 1) continue;
                selected[k] = cand;
                used[cand] = 1;
                recv_func(k + 1);
                selected[k] = 0;
                used[cand] = 0;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        selected = new int[M + 1];
        used = new int[N + 1];
        recv_func(1);
        System.out.println(sb.toString());
    }
}