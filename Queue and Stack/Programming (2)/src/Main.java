import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int count = scanner.nextInt();
            Deque<Integer> stack = new ArrayDeque<>();
            while (count-- > 0) {
                stack.offerLast(scanner.nextInt());
            }
            while (!stack.isEmpty()) {
                System.out.println(stack.pollLast());
            }
        }
    }
}