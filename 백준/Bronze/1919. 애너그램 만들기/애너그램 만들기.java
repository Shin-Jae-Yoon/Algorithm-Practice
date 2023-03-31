import java.io.*;

public class Main {
    public static int[] getAlphabetCount(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            count[(str.charAt(i) - 'a')]++;
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();

        int[] countA = getAlphabetCount(a);
        int[] countB = getAlphabetCount(b);

        int result = 0;

        for (int i = 0; i < 26; i++) {
            result += Math.abs(countA[i] - countB[i]);
        }
        System.out.println(result);
    }
}