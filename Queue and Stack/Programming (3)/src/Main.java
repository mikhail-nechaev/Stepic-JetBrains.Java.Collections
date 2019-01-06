import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Deque<Integer> queue = new ArrayDeque<>();
            int i = scanner.nextInt();
            while (i-- > 0) {
                int j = scanner.nextInt();
                if (j % 2 == 0) {
                    queue.addFirst(j);
                } else {
                    queue.addLast(j);
                }
            }

            for (int j : queue) {
                System.out.println(j);
            }
        }
    }
}