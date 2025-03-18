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
            boolean isPossible = strfry(firstString[i], secondString[i]);

            if (isPossible) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }

    private static boolean strfry(String firstString, String secondString) {
        int[] appearedString = new int[26];

        for (int i = 0; i < firstString.length(); i++) {
            appearedString[firstString.charAt(i) - 'a']++;
        }

        for (int i = 0; i < secondString.length(); i++) {
            appearedString[secondString.charAt(i) - 'a']--;
        }

        boolean isPossible = true;
        for (int i = 0; i < appearedString.length; i++) {
            if (appearedString[i] != 0) {
                isPossible = false;
            }
        }

        return isPossible;
    }
}