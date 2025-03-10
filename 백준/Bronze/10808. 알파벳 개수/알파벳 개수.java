import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        char[] alphabets = word.toCharArray();
        int[] countArray = new int[26];

        for (int i = 0; i < alphabets.length; i++) {
            countArray[alphabets[i] - 'a']++;
        }

        for (int i = 0; i < countArray.length; i++) {
            System.out.print(countArray[i] + " ");
        }
    }
}