import java.util.ArrayDeque;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(2);
        queue.offer(0);
        queue.offer(1);
        queue.offer(7);
        System.out.println(queue);

    }
}