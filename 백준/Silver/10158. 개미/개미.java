import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(br.readLine());

        int currentX = (t + x) % (2 * w);
        int currentY = (t + y) % (2 * h);
        if (currentX > w)
            currentX = 2 * w - currentX;
        if (currentY > h)
            currentY = 2 * h - currentY;

        System.out.println(currentX + " " + currentY);
    }
}