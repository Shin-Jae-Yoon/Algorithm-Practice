import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if ('A' <= arr[i] && arr[i] <= 'Z') {
                arr[i] = (char)('a' + arr[i] - 'A');
            } else {
                arr[i] = (char)('A' + arr[i] - 'a');
            }
            System.out.print(arr[i]);
        }
    }
}