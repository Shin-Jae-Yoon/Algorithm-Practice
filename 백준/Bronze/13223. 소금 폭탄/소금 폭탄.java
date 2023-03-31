import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] now_time = br.readLine().split(":");
        String[] insert_time = br.readLine().split(":");

        int now_hour = Integer.parseInt(now_time[0]);
        int now_min = Integer.parseInt(now_time[1]);
        int now_sec = Integer.parseInt(now_time[2]);
        int now_calc = now_hour * 3600 + now_min * 60 + now_sec;

        int insert_hour = Integer.parseInt(insert_time[0]);
        int insert_min = Integer.parseInt(insert_time[1]);
        int insert_sec = Integer.parseInt(insert_time[2]);
        int insert_calc = insert_hour * 3600 + insert_min * 60 + insert_sec;

        int result_calc = insert_calc - now_calc;
        if (result_calc <= 0)
            result_calc += 24 * 3600;

        int result_hour = result_calc / 3600;
        int result_min = (result_calc % 3600) / 60;
        int result_sec = result_calc % 60;

        System.out.printf("%02d:%02d:%02d", result_hour, result_min, result_sec);
    }
}