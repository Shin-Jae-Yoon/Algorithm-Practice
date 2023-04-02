import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[][] input = new int[t][21];
        int[][] sorted = new int[t][21];

        int count = 0;
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 21; j++) {
                input[i][j] = Integer.parseInt(st.nextToken());
            }

            for (int j = 1; j < 21; j++) {
                boolean find = false;
                for (int k = 0; k < j; k++) {
                    if (sorted[i][k] > input[i][j]) {
                        find = true;
                        for (int z = j - 1; z >= k; z--) {
                            sorted[i][z + 1] = sorted[i][z];
                            count++;
                        }
                        sorted[i][k] = input[i][j];
                        break;
                    }
                    if (!find) sorted[i][j] = input[i][j];
                }
            }
            System.out.println(i+1 + " " + count);
            count = 0;
        }
    }
}