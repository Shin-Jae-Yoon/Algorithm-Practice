import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());

        int[] input = new int[n];
        for (int i = 0; i < n; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        int[] cnt = new int[1000001];
        for (int i = 0; i < n; i++) {
            cnt[input[i]]++;
        }

        int ans = 0;

        for (int i = 1; i <= (x - 1) / 2; i++) {
            if (i <= 1000000 && x - i <= 1000000)
                if (cnt[i] == 1 && cnt[x-i] == 1)
                    ans++;
        }

        bw.write(ans + "\n");
        bw.flush();
    }
}
