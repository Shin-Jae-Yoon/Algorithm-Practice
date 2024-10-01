import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        long[] prefixSum = new long[n + 1];
        long[] countArray = new long[m];
        long answer = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= n; i++) {
            prefixSum[i] = prefixSum[i - 1] + Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i <= n; i++) {
            int remainder = (int) (prefixSum[i] % m);

            if (remainder == 0) {
                answer++;
            }

            countArray[remainder]++;
        }

        for (int i = 0; i < m; i++) {
            if (countArray[i] > 1) {
                answer = answer + (countArray[i] * (countArray[i] - 1) / 2);
            }
        }
        
        sb.append(answer);
        System.out.println(sb.toString());
    }
}
