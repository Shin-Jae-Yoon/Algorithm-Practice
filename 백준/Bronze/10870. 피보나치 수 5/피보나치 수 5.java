import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    private static int[] forMemoization;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // n + 2 으로 설정한 이유
        // - n + 1 으로 하면, n이 0일 때 배열 크기가 0
        // - arr[1] 설정 못하고 ArrayOutOfIndex Exception

        // 초기 세팅값 -1 으로 설정한 이유
        // - 피보나치 수에서 나올 수 없는 수라서 "갱신되지 않은 값" 이란 것을
        // - 나타내기 좋았음
        forMemoization = new int[n + 2];
        Arrays.fill(forMemoization, -1);

        forMemoization[0] = 0;
        forMemoization[1] = 1;

        System.out.println(recursiveMemoization(n));
    }

    // 01. 재귀 + 메모이제이션 ( O(n) )
    private static int recursiveMemoization(int n) {
        if (forMemoization[n] != -1) {
            return forMemoization[n];
        }

        forMemoization[n] = recursiveMemoization(n - 1) + recursiveMemoization(n - 2);

        return forMemoization[n];
    }

    // 02. 단순 재귀 ( O(2 ^ n) )
    private static int recursiveFibonacci(int n) {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    // 03. 반복문 + 메모이제이션 ( O(n) )
    private static int loopFibonacci(int n) {
        int[] arr = new int[n + 2];

        arr[0] = 0;
        arr[1] = 1;

        for (int i = 2; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }

        return arr[n];
    }
}
