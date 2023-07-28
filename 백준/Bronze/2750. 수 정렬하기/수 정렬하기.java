import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] input = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        int temp = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (input[i] > input[j]) {
                    temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            sb.append(input[i]).append('\n');
        }

        System.out.println(sb.toString());
    }
}