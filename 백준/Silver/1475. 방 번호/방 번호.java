import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] countArray = new int[10];

        for (char number : String.valueOf(n).toCharArray()) {
            countArray[number - '0']++;
        }

        int maxCount = 0;
        for (int i = 0; i < countArray.length; i++) {
            if (i == 6 || i == 9) {
                continue;
            }

            maxCount = Math.max(maxCount, countArray[i]);
        }

        int sixNineCount = (countArray[6] + countArray[9] + 1) / 2;

        System.out.println(Math.max(maxCount, sixNineCount));
    }
}