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
        int m = Integer.parseInt(br.readLine());
        int[] materialList = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            materialList[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(materialList);

        int count = 0;
        int startIndex = 0;
        int endIndex = n - 1;

        while (startIndex < endIndex) {
            if (materialList[startIndex] + materialList[endIndex] == m) {
                count++;
                startIndex++;
                endIndex--;
            } else if (materialList[startIndex] + materialList[endIndex] > m) {
                endIndex--;
            } else {
                startIndex++;
            }
        }

        sb.append(count);
        System.out.println(sb.toString());
    }
}
