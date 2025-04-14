import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            List<Character> password = new LinkedList<>();
            ListIterator<Character> listIterator = password.listIterator();
            String input = br.readLine();

            for (int i = 0; i < input.length(); i++) {
                char current = input.charAt(i);

                switch (current) {
                    case '<':
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }

                        break;

                    case '>':
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }

                        break;

                    case '-':
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                            listIterator.remove();
                        }

                        break;

                    default:
                        listIterator.add(current);
                }
            }


            for (char c : password) {
                sb.append(c);
            }

            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}