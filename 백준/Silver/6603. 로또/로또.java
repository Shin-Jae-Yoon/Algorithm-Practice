import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static final int R = 6;
    private static int[] combinationList, chooseList;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());

            if (N == 0) {
                break;
            }

            combinationList = new int[N];
            chooseList = new int[R];

            for (int i = 0; i < N; i++) {
                combinationList[i] = Integer.parseInt(st.nextToken());
            }

            combination(0, 0);
            sb.append("\n");
        }

        System.out.print(sb.toString());
    }

    private static void combination(int index, int level) {
        // base case
        if (level == R) {
            for (int choose : chooseList) {
                sb.append(choose).append(" ");
            }

            sb.append("\n");
            return;
        }

        // recursive case
        for (int i = index; i < N; i++) {
            chooseList[level] = combinationList[i];
            combination(i + 1, level + 1);
        }
    }
}
