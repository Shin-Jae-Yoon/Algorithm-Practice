import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        char[][] input = new char[r][c];
        for (int i = 0; i < r; i++)
            input[i] = br.readLine().toCharArray();

        boolean[] existRow = new boolean[r];
        boolean[] existCol = new boolean[c];

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (input[i][j] == 'X') {
                    existRow[i] = true;
                    existCol[j] = true;
                }
            }
        }

        int resultRowCount = r;
        int resultColCount = c;
        for (int i = 0; i < r; i++) {
            if (existRow[i]) resultRowCount--;
        }

        for (int i = 0; i < c; i++) {
            if (existCol[i]) resultColCount--;
        }

        System.out.println(Math.max(resultRowCount, resultColCount));
    }
}