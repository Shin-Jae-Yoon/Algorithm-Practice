import java.io.*;
import java.util.*;
// 대문자 65 ~ 90
// 소문자 97 ~ 122
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        for (char i : arr) {
            if (i >= 'a' && i <= 'z') {
                System.out.print((char)(Integer.valueOf(i) - 32));
            } else {
                System.out.print((char)(Integer.valueOf(i) + 32));
            }
        }
    }
}