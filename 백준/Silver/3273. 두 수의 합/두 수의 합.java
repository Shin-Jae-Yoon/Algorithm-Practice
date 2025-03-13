import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(br.readLine());
        
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        
        boolean[] countArray = new boolean[x + 1];
        
        int result = 0;
        for (int i = 0; i < n; i++) {
            int needed = x - nums[i];
            
            if (needed > 0 && needed < countArray.length && countArray[needed]) {
                result++;
            }

            if (nums[i] < countArray.length) {
                countArray[nums[i]] = true;
            }
        }

        System.out.println(result);
    }
}