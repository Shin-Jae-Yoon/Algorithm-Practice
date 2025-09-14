import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    private static final String HYPHEN = "-";
    private static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        // topDown
        while ((input = br.readLine()) != null && !input.isEmpty()) {
            int N = Integer.parseInt(input);
            StringBuilder sb = new StringBuilder();

            topDownCantor(N, sb);
            System.out.println(sb.toString());
        }

        // bottomUp
//        String[] answer = bottomUpCantor();
//        while ((input = br.readLine()) != null && !input.isEmpty()) {
//            int N = Integer.parseInt(input);
//            System.out.println(answer[N]);
//        }
    }

    /**
     * topDownCantor(n) : 입력이 n일 때, 답을 출력하는 메서드
     * topDownCantor(n) = topDownCantor(n - 1) + 공백 3 ^ (n - 1)개 + topDownCantor(n - 1) Ź
     */
    private static void topDownCantor(int n, StringBuilder sb) {
        // base case
        if (n == 0) {
            sb.append(HYPHEN);
            return;
        }

        // recursive case
        topDownCantor(n - 1, sb);

        int spaces = (int) Math.pow(3, n - 1);
        for (int i = 0; i < spaces; i++) {
            sb.append(BLANK);
        }

        topDownCantor(n - 1, sb);
    }

    /**
     * N과 N-1의 관계 파악
     * n = 0 : -
     * n = 1 : - -
     * n = 2 : - -   - -
     * n = 3 : - -   - -         - -   - -
     * 문자열 (n - 1) + 공백 3 ^ (n - 1)개 + 문자열 (n - 1)
     */
    private static String[] bottomUpCantor() {
        String[] lineArray = new String[13];
        lineArray[0] = HYPHEN;

        for (int i = 1; i <= 12; i++) {
            int spaces = (int) Math.pow(3, i - 1);
            lineArray[i] = lineArray[i - 1] + BLANK.repeat(spaces) + lineArray[i - 1];
        }

        return lineArray;
    }
}
