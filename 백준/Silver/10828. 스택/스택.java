import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        while (n-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command) {
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    stack.push(num);
                    break;

                case "pop":
                    if (stack.isEmpty()) {
                        sb.append("-1");
                        sb.append("\n");
                        break;
                    }

                    sb.append(stack.pop());
                    sb.append("\n");
                    break;

                case "size":
                    sb.append(stack.size());
                    sb.append("\n");
                    break;

                case "empty":
                    if (stack.isEmpty()) {
                        sb.append("1");
                    } else {
                        sb.append("0");
                    }

                    sb.append("\n");
                    break;

                case "top":
                    if (stack.isEmpty()) {
                        sb.append("-1");
                        sb.append("\n");
                        break;
                    }

                    sb.append(stack.peek());
                    sb.append("\n");
                    break;
            }
        }

        System.out.println(sb.toString());
    }
}