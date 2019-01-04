import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Main {

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1, 2, 3, 4));
        queue.offer(5);
        queue.poll();
        queue.poll();
        System.out.println(queue);

    }
}