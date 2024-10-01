import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        Arrays.sort(arr);

        int goodNumber = 0;

        for (int targetIndex = 0; targetIndex < n; targetIndex++) {
            int startIndex = 0;
            int endIndex = n - 1;
            long target = arr[targetIndex];

            while (startIndex < endIndex) {
                if (arr[startIndex] + arr[endIndex] == target) {
                    if (startIndex != targetIndex && endIndex != targetIndex) {
                        goodNumber++;
                        break;   
                    } else if (startIndex == targetIndex) {
                        startIndex++;
                    } else {
                        endIndex--;
                    }
                } else if (arr[startIndex] + arr[endIndex] < target) {
                    startIndex++;
                } else {
                    endIndex--;
                }
            }
        }

        sb.append(goodNumber);
        System.out.println(sb.toString());
    }
}
