import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static int N;
    private static int[] numberList, chooseList;
    private static boolean[] checkList;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        numberList = new int[N ];
        chooseList = new int[N];
        checkList = new boolean[N];

        for (int i = 0; i < N; i++) {
            numberList[i] = i + 1;
        }

        permutation(0);
        System.out.print(sb.toString());
    }

    private static void permutation(int level) {
        if (level == N) {
            for (int number : chooseList) {
                sb.append(number).append(" ");
            }

            sb.append("\n");
        }

        for (int i = 0; i < N; i++) {
            if (checkList[i]) {
                continue;
            }

            chooseList[level] = numberList[i];
            checkList[i] = true;

            permutation(level + 1);
            checkList[i] = false;
        }
    }
}
