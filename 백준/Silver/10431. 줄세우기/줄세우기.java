import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] input = new int[20];

        for (int num = 0; num < t; num++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            st.nextToken();
            for (int i = 0; i < 20; i++) {
                input[i] = Integer.parseInt(st.nextToken());
            }

            int count = 0;
            for (int i = 0; i < 20; i++) {
                for (int j = 0; j < i; j++) {
                    if (input[j] > input[i]) {
                        count++;
                    }
                }
            }
            System.out.println((num + 1) + " " + count );
        }
    }
}