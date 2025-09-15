import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static char[] alphabetList, chooseList;
    private static int L, C;
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        // 암호 : 서로 다른 L개 알파벳 구성
        // 최소 1개 모음 + 최소 2개 자음 ( + 오름차순 정렬 )
        // 서로 다른 C 개 중에 L 개를 순서 상관없이 뽑기 -> 조합
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        L = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        alphabetList = new char[C];
        chooseList = new char[L];

        StringTokenizer alphabet = new StringTokenizer(br.readLine());
        for (int i = 0; i < alphabetList.length; i++) {
            alphabetList[i] = alphabet.nextToken().charAt(0);
        }

        Arrays.sort(alphabetList);
        combination(0, 0);

        System.out.print(sb.toString());
    }

    private static void combination(int index, int level) {
        if (level == L) {
            if (isValidWord(chooseList)) {
                sb.append(chooseList).append("\n");
            }

            return;
        }

        for (int i = index; i < C; i++) {
            chooseList[level] = alphabetList[i];
            combination(i + 1, level + 1);
        }
    }

    private static boolean isValidWord(char[] password) {
        int vowelCount = 0;
        int consonantCount = 0;

        for (char c : password) {
            if (isVowel(c)) {
                vowelCount++;
                continue;
            }

            consonantCount++;
        }

        return vowelCount >= 1 && consonantCount >= 2;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
