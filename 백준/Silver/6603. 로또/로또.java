import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    private static int N;
    private static int R = 6;
    private static int[] combinationList;
    private static List<Integer> chooseList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;

        while (!(input = br.readLine()).equals("0") && !input.isEmpty()) {
            StringTokenizer st = new StringTokenizer(input);
            N = Integer.parseInt(st.nextToken());

            combinationList = new int[N];
            for (int i = 0; i < N; i++) {
                combinationList[i] = Integer.parseInt(st.nextToken());
            }

            StringBuilder sb = new StringBuilder();
            combination(0, 0, sb);
            System.out.println(sb.toString());
        }
    }

    private static void combination(int index, int level, StringBuilder sb) {
        // base case
        if (level == R) {
            for (Integer choose : chooseList) {
                sb.append(choose);
                sb.append(" ");
            }

            sb.append("\n");
        }

        // recursive case
        for (int i = index; i < N; i++) {
            chooseList.add(combinationList[i]);
            combination(i + 1, level + 1, sb);
            chooseList.remove(chooseList.size() - 1);
        }
    }
}
