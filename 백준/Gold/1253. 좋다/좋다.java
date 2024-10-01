import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    private static int n;
    private static long[] arr;

    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        arr = new long[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        int goodNumber = 0;

        for (int targetIndex = 0; targetIndex < n; targetIndex++) {
            if (isGoodNumber(targetIndex)) {
                goodNumber++;
            }
        }

        sb.append(goodNumber);
        System.out.println(sb.toString());
    }

    private static boolean isGoodNumber(int targetIndex) {
        int leftIndex = 0;
        int rightIndex = n - 1;
        long targetNumber = arr[targetIndex];

        while (leftIndex < rightIndex) {
            if (leftIndex == targetIndex) {
                leftIndex++;
                continue;
            }

            if (rightIndex == targetIndex) {
                rightIndex--;
                continue;
            }

            long sum = arr[leftIndex] + arr[rightIndex];
            if (sum == targetNumber) {
                return true;
            } else if (sum < targetNumber) {
                leftIndex++;
            } else {
                rightIndex--;
            }
        }

        return false;
    }
}
