import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] countArray = new int[10];
        int input = 1;

        for (int i = 0; i < 3; i++) {
            input *= Integer.parseInt(br.readLine());
        }

        char[] inputToChaArray = String.valueOf(input).toCharArray();

        for (char num : inputToChaArray) {
            countArray[num - '0']++;
        }

        for (int result : countArray) {
            System.out.println(result);
        }
    }
}