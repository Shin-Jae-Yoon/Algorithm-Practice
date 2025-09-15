import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static final int MAX_NUMBER = 1000;
    private static boolean[] isPrime = new boolean[MAX_NUMBER + 1];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] numberList = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i <= Math.sqrt(MAX_NUMBER); i++) {
            if (!isPrime[i]) {
                continue;
            }

            for (int j = 2 * i; j <= MAX_NUMBER; j += i) {
                isPrime[j] = false;
            }
        }

        int primeCount = 0;
        for (int num : numberList) {
            if (isPrime[num]) {
                primeCount++;
            }
        }

        System.out.println(primeCount);
    }
}
