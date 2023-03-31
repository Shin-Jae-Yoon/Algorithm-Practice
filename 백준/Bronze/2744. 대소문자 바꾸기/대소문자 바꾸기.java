import java.io.*;
import java.util.*;
// 대문자 65 ~ 90
// 소문자 97 ~ 122
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result = "";
        for (char c : br.readLine().toCharArray()) {
            if ((int)c <= 90 && (int)c >= 65) {
                c = (char)((int)c + 32);
            } else {
                c = (char)((int)c - 32);
            }
            result += c;
        }
        System.out.println(result);
    }
}