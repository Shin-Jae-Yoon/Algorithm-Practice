import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String numList = br.readLine();

        char[] numbers = new char[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            numbers[i] = numList.charAt(i);
            sum += (numbers[i] - '0');
        }

        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb.toString());
    }
}
