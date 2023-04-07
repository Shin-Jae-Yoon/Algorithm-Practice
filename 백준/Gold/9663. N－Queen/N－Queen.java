import java.io.*;

public class Main {
    static int N, count;
    static int[] col;
    static StringBuilder sb = new StringBuilder();

    static void rec_func(int row) {
        if (row == N+1) {
            count++;
        } else {
            for (int c = 1; c <= N; c++) {
                boolean possible = true;
                for (int i = 1; i <= row - 1; i++) {
                    if (attack(row, c, i, col[i])) {
                        possible = false;
                        break;
                    }
                }
                if (possible) {
                    col[row] = c;
                    rec_func(row + 1);
                    col[row] = 0;
                }
            }
        }
    }

    static boolean check() {
        for (int i = 1; i <= N; i++) {
            // (i, col[i])
            for (int j = 1; j < i; j++) {
                // (j, col[j])
                if (attack(i, col[i], j, col[j]))
                    return false;
            }
        }
        return true;
    }

    static boolean attack(int r1, int c1, int r2, int c2) {
        if (c1 == c2) return true;
        if (r1 - c1 == r2 - c2) return true;
        if (r1 + c1 == r2 + c2) return true;
        return false;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        col = new int[N+1];
        rec_func(1);
        System.out.println(sb.append(count));
    }
}