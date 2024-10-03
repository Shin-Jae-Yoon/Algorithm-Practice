import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.lang.StringBuilder;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        boolean isPossible = true;
        int current = 1;

        while (n > 0) {
            int target = Integer.parseInt(br.readLine());

            if (current <= target) {
                while (current <= target) {
                    stack.push(current);
                    sb.append("+");
                    sb.append("\n");
                    current++;
                }

                stack.pop();
                sb.append("-");
                sb.append("\n");
            } else {
                if (stack.pop() > target) {
                    isPossible = false;
                    break;
                } else {
                    sb.append("-");
                    sb.append("\n");
                }
            }

            n--;
        }

        if (isPossible) {
            System.out.println(sb.toString());
        } else {
            System.out.println("NO");
        }
    }
}
