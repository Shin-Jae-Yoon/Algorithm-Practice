import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.StringBuilder;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] _list = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            _list[i] = Integer.parseInt(st.nextToken());
        }

        Stack<Integer> stack = new Stack<>();
        Deque<Integer> answer = new ArrayDeque<>();

        for (int i = n - 1; i >= 0; i--) {
            while (true) {
                if (stack.isEmpty()) {
                    answer.addFirst(-1);
                    stack.push(_list[i]);
                    break;
                }
                int num = stack.pop();
                if (num > _list[i]) {
                    answer.addFirst(num);
                    stack.push(num);
                    stack.push(_list[i]);
                    break;
                }
            }
        }

        // 출력
        for (int num : answer) {
            sb.append(num);
            sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}

