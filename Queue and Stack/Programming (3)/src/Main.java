import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            Deque<Integer> deque = new ArrayDeque<>();
            while (count-- > 0) {
                int x = scanner.nextInt();
                if (x % 2 == 0) {
                    deque.offerFirst(x);
                } else {
                    deque.offerLast(x);
                }
            }
            while (!deque.isEmpty()) {
                System.out.println(deque.pollFirst());
            }
        }
    }
}