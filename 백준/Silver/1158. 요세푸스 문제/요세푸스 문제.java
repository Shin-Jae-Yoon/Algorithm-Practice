import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> nums = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }

        List<Integer> result = new LinkedList<>();
        int currentIndex = 0;
        while (!nums.isEmpty()) {
            currentIndex = (currentIndex + k - 1) % nums.size();

            if (nums.size() > 1) {
                sb.append(nums.remove(currentIndex));
                sb.append(", ");
            } else {
                sb.append(nums.remove(currentIndex));
            }
        }

        sb.append(">");
        System.out.println(sb.toString());
    }
}