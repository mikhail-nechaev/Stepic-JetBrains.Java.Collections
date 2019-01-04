import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Queue<Integer> firstQueue = new ArrayDeque<>();
            int firstQueueLoad = 0;
            Queue<Integer> secondQueue = new ArrayDeque<>();
            int secondQueueLoad = 0;
            int count = scanner.nextInt();
            while (count-- > 0) {
                int taskId = scanner.nextInt();
                int taskLoad = scanner.nextInt();
                if (firstQueueLoad > secondQueueLoad) {
                    secondQueue.offer(taskId);
                    secondQueueLoad += taskLoad;
                } else {
                    firstQueue.offer(taskId);
                    firstQueueLoad += taskLoad;
                }
            }
            while (!firstQueue.isEmpty()) {
                System.out.print(firstQueue.poll() + " ");
            }
            System.out.println();
            while (!secondQueue.isEmpty()) {
                System.out.print(secondQueue.poll() + " ");
            }
        }
    }
}