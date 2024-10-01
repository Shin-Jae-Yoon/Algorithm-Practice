import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        String dna = br.readLine();

        st = new StringTokenizer(br.readLine());
        int[] countArray = new int[100];
        countArray['A'] = Integer.parseInt(st.nextToken());
        countArray['C'] = Integer.parseInt(st.nextToken());
        countArray['G'] = Integer.parseInt(st.nextToken());
        countArray['T'] = Integer.parseInt(st.nextToken());

        int startIndex = 0;
        int endIndex = p;
        int answer = 0;
        int[] replicaArray = new int[100];

        for (int i = 0; i < endIndex; i++) {
            int idx = dna.charAt(i);
            replicaArray[idx]++;
        }

        if (isDone(replicaArray, countArray)) {
            answer++;
        }

        while (endIndex < s) {
            replicaArray[dna.charAt(startIndex++)]--;
            replicaArray[dna.charAt(endIndex++)]++;
            if (isDone(replicaArray, countArray)) {
                answer++;
            }

        }

        System.out.println(answer);
    }

    private static boolean isDone(int[] replicaArray, int[] countArray) {
        return replicaArray['A'] >= countArray['A']
                && replicaArray['C'] >= countArray['C']
                && replicaArray['G'] >= countArray['G']
                && replicaArray['T'] >= countArray['T'];
    }
}
