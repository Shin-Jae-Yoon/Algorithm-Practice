import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for (int i = 1; i <= n; i++) {
            sb.append(("*").repeat(i));
            sb.append('\n');
        }

        System.out.println(sb.toString());
    }
}