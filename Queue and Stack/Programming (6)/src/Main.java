import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            StringBuilder stringBuilder = new StringBuilder();
            Deque<Integer> deque = new ArrayDeque<>();
            Queue<Integer> queueMax = new PriorityQueue<>(Collections.reverseOrder());

            int i = scanner.nextInt();

            while (i-- > 0){
                String tmp = scanner.next();
                switch (tmp){
                case "push":
                    int value = scanner.nextInt();
                    deque.addFirst(value);
                    queueMax.add(value);
                    break;
                case "pop":
                    queueMax.remove(deque.removeFirst());
                    break;
                case "max":
                    stringBuilder.append(queueMax.peek()).append('\n');
                    break;
                }
            }
            System.out.println(stringBuilder.toString());
        }
    }
}