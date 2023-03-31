import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] now = br.readLine().split(":");
        String[] insert = br.readLine().split(":");

        int h = Integer.parseInt(insert[0]) - Integer.parseInt(now[0]);
        int m = Integer.parseInt(insert[1]) - Integer.parseInt(now[1]);
        int s = Integer.parseInt(insert[2]) - Integer.parseInt(now[2]);

        if (s < 0) {
            s += 60;
            m--;
        }

        if (m < 0) {
            m += 60;
            h--;
        }

        if (h < 0) {
            h += 24;
        }

        if (h == 0 && m == 0 && s == 0) {
            h = 24;
        }

        System.out.printf("%02d:%02d:%02d", h, m, s);
    }
}