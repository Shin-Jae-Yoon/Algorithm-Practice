import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            int target = Integer.parseInt(br.readLine());

            if (target == 0 && !stack.isEmpty()) {
                stack.pop();
                continue;
            }

            stack.push(target);
        }

        int sum = 0;
        int stackSize = stack.size();

        while (stackSize-- > 0) {
            sum += stack.pop();
        }

        System.out.println(sum);
    }
}
