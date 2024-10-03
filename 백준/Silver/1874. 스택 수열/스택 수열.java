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
        int current = 1;

        while (n > 0) {
            int target = Integer.parseInt(br.readLine());

            while (current <= target) {
                 if (stack.isEmpty() || stack.peek() != target) {
                    stack.push(current);
                    sb.append("+");
                    sb.append("\n");
                    current++;
                }
            }

            if (!stack.isEmpty() && stack.peek() == target) {
                stack.pop();
                sb.append("-");
                sb.append("\n");
            }

            n--;
        }

        if (!stack.isEmpty()) {
            System.out.println("NO");
            return;
        }

        System.out.println(sb.toString());
    }
}
