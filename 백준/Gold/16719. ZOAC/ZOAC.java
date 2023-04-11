import java.io.*;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static String input;
    static boolean[] visited;

    static void rec_func(int left, int right) {
        if (left > right) {
            return;
        }

        else {
            int index = left;

            for (int cand = left; cand <= right; cand++) {
                if (input.charAt(index) > input.charAt(cand)) {
                    index = cand;
                }
            }

            visited[index] = true;

            for (int i = 0; i < input.length(); i++) {
                if (visited[i]) {
                    sb.append(input.charAt(i));
                }
            }

            sb.append("\n");

            rec_func(index + 1, right);
            rec_func(left, index - 1);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        input = br.readLine();
        visited = new boolean[input.length()];

        rec_func(0, input.length() - 1);
        System.out.println(sb.toString());
    }
}