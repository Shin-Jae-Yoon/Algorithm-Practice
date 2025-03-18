import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[] firstString = new String[n];
        String[] secondString = new String[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            firstString[i] = st.nextToken();
            secondString[i] = st.nextToken();
        }

        for (int i = 0; i < n; i++) {
            strfry(firstString[i], secondString[i]);
        }
    }

    private static void strfry(String firstString, String secondString) {
        int[] appearedFirstString = new int[200];
        int[] appearedSecondString = new int[200];

        char[] firstStringToChar = firstString.toCharArray();
        char[] secondStringToChar = secondString.toCharArray();

        for (char alphabet : firstStringToChar) {
            appearedFirstString[alphabet]++;
        }

        for (char alphabet : secondStringToChar) {
            appearedSecondString[alphabet]++;
        }

        int count = 0;

        for (int i = 'a'; i <= 'z'; i++) {
            if (appearedFirstString[i] == appearedSecondString[i] && appearedFirstString[i] != 0) {
                count += appearedFirstString[i];
            }
        }

        if (count == firstStringToChar.length) {
            System.out.println("Possible");
        } else {
            System.out.println("Impossible");
        }
    }
}
