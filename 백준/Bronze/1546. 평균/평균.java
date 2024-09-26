import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;

public class Main {
    private static final int MIN_VAL = Integer.MIN_VALUE;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        double[] scores = new double[N];
        double maxScore = MIN_VAL;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            scores[i] = Double.parseDouble(st.nextToken());
            maxScore = Math.max(maxScore, scores[i]);
        }

        double sum = 0;

        for (int i = 0; i < N; i++) {
            scores[i] = scores[i] / maxScore * 100.0;
            sum += scores[i];
        }

        double avg = sum / N;

        StringBuilder sb = new StringBuilder();
        sb.append(avg);
        System.out.println(sb.toString());
    }
}
