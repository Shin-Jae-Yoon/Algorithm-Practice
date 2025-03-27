import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        int commandCount = Integer.parseInt(br.readLine());

        LinkedList<Character> linkedList = new LinkedList<>();
        for (char alphabet : input) {
            linkedList.add(alphabet);
        }

        ListIterator<Character> listIterator = linkedList.listIterator(linkedList.size());

        for (int i = 0; i < commandCount; i++) {
            String commandLine = br.readLine();
            char commandType = commandLine.charAt(0);

            switch (commandType) {
                case 'L':
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                    }

                    break;
                case 'D':
                    if (listIterator.hasNext()) {
                        listIterator.next();
                    }

                    break;
                case 'B':
                    if (listIterator.hasPrevious()) {
                        listIterator.previous();
                        listIterator.remove();
                    }

                    break;
                case 'P':
                    listIterator.add(commandLine.charAt(2));

                    break;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (Character character : linkedList) {
            sb.append(character);
        }

        System.out.println(sb.toString());
    }
}
